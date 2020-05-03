package com.aaa.york.config;

import com.aaa.york.model.BookInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author: York
 * @Date: 2020/5/1 000123:30
 * @Version:1.0
 * @Description: 配置feign的配置接口
 */
@FeignClient("book-provider")
public interface FeignConfig {

    @GetMapping("/all")
    List<BookInfo> selectAllBooks();
}
