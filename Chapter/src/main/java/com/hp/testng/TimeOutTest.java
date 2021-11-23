package com.hp.testng;

import org.testng.annotations.Test;
/**
 * 超时测试
 * */
public class TimeOutTest {

    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {

        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testSuccess1() throws InterruptedException {

        Thread.sleep(3000);
    }
}
