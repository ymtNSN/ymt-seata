package com.zhihao.controller;

import com.zhihao.service.StorageService;
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
@RequestMapping("/storage")
@Validated
public class StorageController {

    @Autowired
    private StorageService storageService;

    @PostMapping("/updatedStorage")
    public int updatedStorage(@NotBlank String commodityCode,@NotNull Integer count){
        return storageService.updatedStorage(count,commodityCode);
    }
}
