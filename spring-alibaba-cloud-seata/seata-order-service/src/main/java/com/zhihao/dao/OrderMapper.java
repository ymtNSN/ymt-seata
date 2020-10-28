package com.zhihao.dao;

import com.zhihao.entity.Order;

/**
 * @Author: ZhiHao
 * @Date: 2020/10/27 14:37
 * @Description: 订单dao
 * @Versions 1.0
 **/
public interface OrderMapper {

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
