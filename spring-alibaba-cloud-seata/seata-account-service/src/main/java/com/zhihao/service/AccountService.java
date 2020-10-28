package com.zhihao.service;

/**
 * @Author: ZhiHao
 * @Date: 2020/10/27 14:54
 * @Description:
 * @Versions 1.0
 **/
public interface AccountService {

    /**
     * 更新账户
     *
     * @param userId
     * @param amount
     * @return int
     * @author: ZhiHao
     * @date: 2020/10/27
     */
    int updatedAccount(Integer userId,Double amount);
}
