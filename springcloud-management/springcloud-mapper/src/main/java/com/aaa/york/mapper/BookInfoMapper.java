package com.aaa.york.mapper;

import com.aaa.york.model.BookInfo;

import java.util.List;

public interface BookInfoMapper {
    int deleteByPrimaryKey(Long bookId);

    int insert(BookInfo record);

    BookInfo selectByPrimaryKey(Long bookId);

    List<BookInfo> selectAll();

    int updateByPrimaryKey(BookInfo record);
}