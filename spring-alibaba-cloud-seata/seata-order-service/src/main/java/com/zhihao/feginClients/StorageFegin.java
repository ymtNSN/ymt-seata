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
@FeignClient(name = "seata-storage-service")
public interface StorageFegin {

    @PostMapping("/storage/updatedStorage")
    int updatedStorage(@RequestParam(name = "commodityCode") String commodityCode,
                       @RequestParam(name = "count") Integer count);
}
