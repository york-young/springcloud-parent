package com.aaa.york;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: York
 * @Date: 2020/5/2 000223:20
 * @Version:1.0
 * @Description: 这是配置类
 */
@SpringBootApplication
@EnableConfigServer
public class ApplicationRun5081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun5081.class,args);
    }
}
