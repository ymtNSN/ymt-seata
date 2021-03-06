package com.zhihao.service;

import com.zhihao.entity.Order;

/**
 * @Author: ZhiHao
 * @Date: 2020/10/27 14:54
 * @Description:
 * @Versions 1.0
 **/
public interface OrderService {

    /**
     * 添加订单
     *
     * @param order
     * @return int
     * @author: ZhiHao
     * @date: 2020/10/27
     */
    int addOrder(Order order);
}
