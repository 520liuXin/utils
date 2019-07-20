package com.example.liu.exception;

/*
 * @Author liuxin
 * @Description //TODO 非法的数字异常类
 **/
public class IllegalNumberException extends Exception{
    private static final long serialVersionUID = 1L;
    public IllegalNumberException(){

    }
    public IllegalNumberException(String message){
        super(message);
    }
}