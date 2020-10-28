package com.zhihao.service.impl;

import com.zhihao.dao.StorageMapper;
import com.zhihao.entity.Storage;
import com.zhihao.service.StorageService;
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
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    @Transactional
    @Override
    public int updatedStorage(Integer count, String commodityCode) {
        Storage storage = storageMapper.findStorageByCommodityCode(commodityCode);
        storage.setCount(storage.getCount()-count);
        int i = storageMapper.updatedStorage(storage);
        //int j = i / 0;
        return i;
    }
}
