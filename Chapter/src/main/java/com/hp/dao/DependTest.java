package com.hp.dao;

import org.testng.annotations.Test;

public class DependTest {
    //依赖测试
    @Test
    public void test1(){
        System.out.println("test1 run");

    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
System.out.println("test2 run");
    }

    @Test
    public void test3(){

        System.out.println("运行异常");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test3"})
    public void test4(){

    System.out.println("异常处理");
    }





}
