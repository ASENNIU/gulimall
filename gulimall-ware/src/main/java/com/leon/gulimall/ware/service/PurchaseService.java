package com.leon.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leon.common.utils.PageUtils;
import com.leon.gulimall.ware.entity.PurchaseEntity;
import com.leon.gulimall.ware.vo.MergeVo;

import java.util.Map;

/**
 * 采购信息
 *
 * @author leon
 * @email 1334575226@qq.com
 * @date 2022-12-08 03:01:41
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPageUnreceivePurchase(Map<String, Object> params);

    void mergePurchase(MergeVo mergeVo);
}

