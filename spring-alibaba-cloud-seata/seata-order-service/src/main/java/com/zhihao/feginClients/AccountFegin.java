package com.zhihao.feginClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: ZhiHao
 * @Date: 2020/10/27 15:22
 * @Description:
 * @Versions 1.0
 **/
@FeignClient(name = "seata-account-service")
public interface AccountFegin {

    @PostMapping("/account/updatedAccount")
    int updatedAccount(@RequestParam(name = "userID")String userID, @RequestParam(name = "amount")Double amount);
}
