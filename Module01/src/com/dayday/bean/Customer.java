package com.dayday.bean;


import java.util.ArrayList;
import java.util.Date;

// 中文
public class Customer {
    private static final int NUM1 = 1;
    private static final int NUM2 = 2;
    private static final int NUM3 = 3;
    private static final int NUM4 = 4;
    private static final int NUM5 = 5;
    public static final int NUM6 = 6;
    /**
     * 客户id
     */
    private String id;
    public static final int initial_size = 10;

    public static void main(String[] args) {

        System.out.println("helloworld!!!!!");
        BussinessMan.sayHello();
        System.out.println("helloworld!!!!!");
        System.out.println();
        new Date();
        ArrayList list = new ArrayList();
        list.add(1, new Object());

    }

    public void test() {
        System.out.println("helloworld");
    }
}