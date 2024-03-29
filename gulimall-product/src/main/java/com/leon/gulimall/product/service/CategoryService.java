package com.leon.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leon.common.utils.PageUtils;
import com.leon.gulimall.product.entity.CategoryEntity;
import com.leon.gulimall.product.vo.Catelog2Vo;

import java.util.*;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author leon
 * @email 1334575226@qq.com
 * @date 2022-12-08 02:57:09
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);

    Long[] findCatelogPath(Long catelogId);

    void updateCascade(CategoryEntity category);

    List<CategoryEntity> getLevel1Categorys();

    Map<String, List<Catelog2Vo>> getCatalogJson();
}

