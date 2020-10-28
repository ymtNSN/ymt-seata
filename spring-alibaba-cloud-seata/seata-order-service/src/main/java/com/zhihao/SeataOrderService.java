package com.zhihao;


import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableAutoDataSourceProxy //1.1版本后支持注解自动代理数据源, 不支持XA数据源自动代理
public class SeataOrderService
{
    public static void main( String[] args )
    {
        SpringApplication.run(SeataOrderService.class,args);
    }
}
