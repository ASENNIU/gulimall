package com.leon.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leon.common.utils.PageUtils;
import com.leon.common.utils.Query;

import com.leon.gulimall.product.dao.CategoryDao;
import com.leon.gulimall.product.entity.CategoryEntity;
import com.leon.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 1. 查出所有分类
        List<CategoryEntity> entityList = baseMapper.selectList(null);
        // 2. 组装成树形结构
        // 2.1 查询所有一级分类
        List<CategoryEntity> level1Menus = entityList
                .stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .sorted((entity1, entity2) -> {
                    return (entity1.getSort() == null ? 0 : entity1.getSort()) -
                            (entity2.getSort() == null ? 0 : entity2.getSort());
                })
                .map(menu -> {
                    menu.setChildren(getChildrens(menu, entityList));
                    return menu;
                })
                .collect(Collectors.toList());
        return level1Menus;
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        // 递归查询，自底向上
        return all.stream().filter(categoryEntity ->
                        Objects.equals(categoryEntity.getParentCid(), root.getCatId()))
                .sorted((entity1, entity2) -> {
                    return (entity1.getSort() == null ? 0 : entity1.getSort()) -
                            (entity2.getSort() == null ? 0 : entity2.getSort());
                })
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildrens(categoryEntity, all));
                    return categoryEntity;
                })
                .collect(Collectors.toList());
    }

}