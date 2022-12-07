package com.leon.gulimall.product.dao;

import com.leon.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author leon
 * @email 1334575226@qq.com
 * @date 2022-12-08 02:57:09
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
