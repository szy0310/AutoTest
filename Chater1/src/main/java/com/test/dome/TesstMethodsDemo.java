package com.test.dome;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TesstMethodsDemo {

    @Test
    public void test1(){

        Assert.assertEquals(1,1);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,2);
    }
    @Test
    public  void test3(){
        Assert.assertEquals("111","222");
    }

    @Test
    public void logindome(){
        Reporter.log("zheshi");
        throw  new RuntimeException("这是我自己的异常");

    }
}
