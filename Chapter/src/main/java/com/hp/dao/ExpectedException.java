package com.hp.dao;

import org.testng.annotations.Test;

public class ExpectedException {
    //异常处理

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException(){
         System.out.println("异常测试");
    }
   @Test(expectedExceptions =RuntimeException.class)
    public  void reunTimeE(){
        System.out.println("这个是成功异常测试类");
        throw new RuntimeException();
    }



}
