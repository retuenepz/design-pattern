package com.hongyb.pattern.dao;

/**
 * 自定义异常
 * Created by hongyanbo on 2018/2/5.
 */
public class CustomerException extends Exception{
    private static final long serialVersionUID = 1L;
    public CustomerException(String message) {
        super(message);
    }

    public CustomerException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerException() {
    }
}
