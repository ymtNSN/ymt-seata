package com.zhihao.service.impl;

import com.alibaba.fastjson.JSON;
import com.zhihao.dao.OrderMapper;
import com.zhihao.entity.Order;
import com.zhihao.feginClients.AccountFegin;
import com.zhihao.feginClients.StorageFegin;
import com.zhihao.service.OrderService;
import io.seata.spring.annotation.GlobalLock;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: ZhiHao
 * @Date: 2020/10/27 14:56
 * @Description:
 * @Versions 1.0
 **/
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private StorageFegin storageFegin;

    @Autowired
    private AccountFegin accountFegin;

    //@Transactional 替换成为全局事务
    @GlobalTransactional(name = "orderService-create",rollbackFor = Exception.class)
//    @GlobalLock
    @Override
    public int addOrder(Order order) {
        order.setCount(3);
        order.setAmount(order.getCount()*998);
        order.setCommodityCode(String.valueOf(10001));
        log.info("全部流程开始");
        log.info("创建的订单:{}", JSON.toJSONString(order));
        int addResult = orderMapper.addOrder(order);
        log.info("创建订单的结果:{}",addResult);
        log.info("减库存流程开始");
        int updatedStorage = storageFegin.updatedStorage(order.getCommodityCode(), order.getCount());
        log.info("减库存流程结果:{}",updatedStorage);
        log.info("扣余额流程开始");
        int updatedAccount = accountFegin.updatedAccount(order.getUserId(),
                Double.valueOf(String.valueOf(order.getAmount())));
        log.info("扣余额流程结果:{}",updatedAccount);
        log.info("全部流程结束");
        return addResult;
    }
}
