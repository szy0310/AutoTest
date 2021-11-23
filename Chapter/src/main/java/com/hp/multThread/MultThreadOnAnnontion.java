package com.hp.multThread;

import org.testng.annotations.Test;

/**
 * 多线程测试
 * */
public class MultThreadOnAnnontion {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test1(){

        System.out.println("1");
        System.out.printf("Thead id ",Thread.currentThread().getId());
    }
}
