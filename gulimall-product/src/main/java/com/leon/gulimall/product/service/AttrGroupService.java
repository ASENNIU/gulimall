package com.leon.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leon.common.utils.PageUtils;
import com.leon.gulimall.product.entity.AttrGroupEntity;
import com.leon.gulimall.product.vo.AttrGroupWithAttrsVo;
import com.leon.gulimall.product.vo.SpuItemAttrGroupVo;

import java.util.List;
import java.util.Map;

/**
 * 属性分组
 *
 * @author leon
 * @email 1334575226@qq.com
 * @date 2022-12-08 02:57:09
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params, Long catelogId);
    PageUtils queryPage(Map<String, Object> params);

    List<AttrGroupWithAttrsVo> getAttrGroupWithAttrsByCatelogId(Long catelogId);

    List<SpuItemAttrGroupVo> getAttrGroupWithAttrsBySpuId(Long spuId, Long catalogId);
}

