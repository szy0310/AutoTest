package com.hp.dao.suite;

import org.testng.annotations.Test;

public class lgnoreTest {
    //忽略测试
    @Test(enabled = true)
    public  void ignorel(){
        System.out.println("ignorel执行");
    }
    @Test(enabled = false)
    public  void ignorel2(){
        System.out.println("ignorel执行");
    }
    public  void ignorel3(){
        System.out.println("ignorel执行");
    }



}
