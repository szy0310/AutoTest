package com.hp.testng;

import org.testng.annotations.Test;

/**
* 忽略测试
*/
public class IgnoreTest {

    @Test
    public void ignore1(){

        System.out.println("ignore1运行了");
    }
    @Test(enabled = true)
    public void ignore2(){
        System.out.println("ignore2运行了");
    }

}
