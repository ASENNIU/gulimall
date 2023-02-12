package com.leon.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leon.common.utils.PageUtils;
import com.leon.gulimall.product.entity.SkuImagesEntity;

import java.util.List;
import java.util.Map;

/**
 * sku图片
 *
 * @author leon
 * @email 1334575226@qq.com
 * @date 2022-12-08 02:57:09
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<SkuImagesEntity> getImagesBySkuId(Long skuId);
}

