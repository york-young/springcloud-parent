package com.aaa.york;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;


/**
 * Author: York
 * Date: 2020/5/3 000314:01
 * Version:1.0
 * Description: TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class ApplicationRun2081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun2081.class,args);
    }
}
