package com.leon.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leon.common.utils.PageUtils;
import com.leon.gulimall.order.entity.OrderEntity;
import com.leon.gulimall.order.vo.OrderConfirmVo;
import com.leon.gulimall.order.vo.OrderSubmitVo;
import com.leon.gulimall.order.vo.SubmitOrderResponseVo;

import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * 订单
 *
 * @author leon
 * @email 1334575226@qq.com
 * @date 2022-12-08 02:07:48
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 订单确认页返回需要用的数据
     * @return
     */
    OrderConfirmVo confirmOrder() throws ExecutionException, InterruptedException;

    /**
     * 创建订单
     * @param vo
     * @return
     */
    SubmitOrderResponseVo submitOrder(OrderSubmitVo vo);

    /**
     * 按照订单号获取订单信息
     * @param orderSn
     * @return
     */
    OrderEntity getOrderByOrderSn(String orderSn);

    /**
     * 关闭订单
     * @param orderEntity
     */
    void closeOrder(OrderEntity orderEntity);

    /**
     * 获取当前订单的支付信息
     * @param orderSn
     * @return
     */
    //PayVo getOrderPay(String orderSn);

    /**
     * 查询当前用户所有订单数据
     * @param params
     * @return
     */
    PageUtils queryPageWithItem(Map<String, Object> params);

    /**
     *支付宝异步通知处理订单数据
     * @param asyncVo
     * @return
     */
    //String handlePayResult(PayAsyncVo asyncVo);

    /**
     * 微信异步通知处理
     * @param notifyData
     */
    String asyncNotify(String notifyData);


    /**
     * 创建秒杀单
     * @param orderTo
     */
   // void createSeckillOrder(SeckillOrderTo orderTo);
}

