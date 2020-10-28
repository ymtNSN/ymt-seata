package com.zhihao.controller;

import com.zhihao.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @Author: ZhiHao
 * @Date: 2020/10/27 14:57
 * @Description:
 * @Versions 1.0
 **/
@RestController
@RequestMapping("/account")
@Validated
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/updatedAccount")
    public int updatedAccount(@NotBlank(message = "用户id不能空!") String userID,@NotNull Double amount){
        return accountService.updatedAccount(Integer.valueOf(userID),amount);
    }
}
