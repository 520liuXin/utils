package com.example.liu.exception;

/*
 * @Author liuxin
 * @Description //TODO 非法的二进制数异常类
 **/
public class IllegalBinaryException extends Exception {
    private static final long serialVersionUID = 1L;

    public IllegalBinaryException() {

    }

    public IllegalBinaryException(String message) {
        super(message);
    }
}