package com.aaa.york;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/4/29 15:33
 * @Description
 *      如果ribbon使用的是默认提供的负载均衡算法，则可以不使用ribbon的注解
 *      如果需要自定义的负载均衡算法的时候必须要使用ribbon @RibbonClient注解
 **/
//@EnableCircuitBreaker
//@SpringBootApplication
//@EnableDiscoveryClient

@EnableFeignClients
@SpringCloudApplication
public class ApplicationRunConsumer6081 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunConsumer6081.class, args);
    }

}
