package com.zhihao.dao;

import com.zhihao.entity.Storage;

/**
 * @Author: ZhiHao
 * @Date: 2020/10/27 14:37
 * @Description: 订单dao
 * @Versions 1.0
 **/
public interface StorageMapper {

   /**
    * 更新库存
    *
    * @param storage
    * @return int
    * @author: ZhiHao
    * @date: 2020/10/27
    */
   int updatedStorage(Storage storage);


   Storage findStorageByCommodityCode(String commodityCode);

}
