package com.zhihao.controller;

import com.zhihao.entity.Order;
import com.zhihao.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ZhiHao
 * @Date: 2020/10/27 14:57
 * @Description:
 * @Versions 1.0
 **/
@RestController
@RequestMapping("/order")
@Validated
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/addOrder")
    public Map<String,Object> addOrder(@NotBlank(message = "用户id不能空!") String userID){
        Map<String,Object> result = new HashMap<>();
        Order order = new Order();
        order.setUserId(userID);
        int addOrder = orderService.addOrder(order);
        if (addOrder > 0){
            result.put("message","流程成功!");
        }else {
            result.put("message","流程失败, 应该回滚成功!");
        }
        return result;
    }
}
