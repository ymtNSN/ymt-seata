package com.zhihao.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: ZhiHao
 * @Date: 2020/10/27 12:03
 * @Description:
 * @Versions 1.0
 **/
@Configuration
@EnableTransactionManagement //启用事务
@MapperScan(basePackages = {"com.zhihao.dao"})
public class MybatisConfig {

}
