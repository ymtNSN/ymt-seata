package com.zhihao.dao;

import com.zhihao.entity.Account;

/**
 * @Author: ZhiHao
 * @Date: 2020/10/27 14:37
 * @Description: 订单dao
 * @Versions 1.0
 **/
public interface AccountMapper {

   /**
    * 更新账户
    *
    * @param account
    * @return int
    * @author: ZhiHao
    * @date: 2020/10/27
    */
   int updatedAccount(Account account);

   /**
    * 通过账号ID查询账号
    *
    * @param userId
    * @return com.zhihao.entity.Account
    * @author: ZhiHao
    * @date: 2020/10/27
    */
   Account findAccountByUserId(String userId);

}
