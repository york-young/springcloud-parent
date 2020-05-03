package com.aaa.york;


import com.aaa.york.mapper.BookInfoMapper;
import com.aaa.york.model.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

    /**
     * @author Seven Lee
     * @description
     *      查询所有的图书信息
     * @param []
     * @date 2020/4/27
     * @return java.util.List<com.aaa.lee.springcloud.model.Book>
     * @throws
    **/
    public List<BookInfo> selectAllBooks() {
        return bookInfoMapper.selectAll();
    }

}
