package com.zhihao.service;

/**
 * @Author: ZhiHao
 * @Date: 2020/10/27 14:54
 * @Description:
 * @Versions 1.0
 **/
public interface StorageService {

    /**
     * 更新库存
     *
     * @param count
     * @param commodityCode
     * @return int
     * @author: ZhiHao
     * @date: 2020/10/27
     */
    int updatedStorage(Integer count,String commodityCode);
}
