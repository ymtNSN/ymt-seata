package com.zhihao;
import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: ZhiHao
 * @Date: 2020/10/27 16:19
 * @Description:
 * @Versions 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoDataSourceProxy
public class SeataStorageService {

    public static void main( String[] args )
    {
        SpringApplication.run(SeataStorageService.class,args);
    }
}
