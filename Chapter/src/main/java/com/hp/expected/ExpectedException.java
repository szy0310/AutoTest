package com.hp.expected;

import org.testng.annotations.Test;

/*
* 异常测试
* */
public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class )
    public void runTimeExceptionFailed(){
        System.out.println("这个是失败的异常测试");

    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();

    }



}
