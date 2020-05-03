package com.aaa.york.model;

import java.io.Serializable;

public class BookInfo implements Serializable {
    private Long bookId;

    private String bookName;

    private Integer bookCatId;

    private Long bookPrice;

    private Integer bookStatus;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public Integer getBookCatId() {
        return bookCatId;
    }

    public void setBookCatId(Integer bookCatId) {
        this.bookCatId = bookCatId;
    }

    public Long getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Long bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Integer bookStatus) {
        this.bookStatus = bookStatus;
    }
}