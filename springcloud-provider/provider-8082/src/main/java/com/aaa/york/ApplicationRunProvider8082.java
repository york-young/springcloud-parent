package com.aaa.york;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/4/27 17:08
 * @Description
 **/
@SpringBootApplication
@MapperScan("com.aaa.york.mapper")
@EnableDiscoveryClient
public class ApplicationRunProvider8082 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunProvider8082.class, args);
    }

}
