package com.aaa.york;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: York
 * @Date: 2020/5/2 00029:55
 * @Version:1.0
 * @Description: TODO
 */
@SpringBootApplication
@EnableZuulProxy
public class ApplicationRunZuul9081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunZuul9081.class,args);
    }
}
