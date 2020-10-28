package com.zhihao.service.impl;

import com.zhihao.dao.AccountMapper;
import com.zhihao.entity.Account;
import com.zhihao.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: ZhiHao
 * @Date: 2020/10/27 14:56
 * @Description:
 * @Versions 1.0
 **/
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Transactional
    @Override
    public int updatedAccount(Integer userId, Double amount) {
        Account account = accountMapper.findAccountByUserId(String.valueOf(userId));
        if (account.getMoney().compareTo(amount) == -1){
            throw new RuntimeException("账号金额小于订单金额, 无法扣款!");
        }
        account.setMoney(account.getMoney()-amount);
        return accountMapper.updatedAccount(account);
    }
}
