package com.leon.gulimall.order.dao;

import com.leon.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author leon
 * @email 1334575226@qq.com
 * @date 2022-12-08 02:07:48
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
