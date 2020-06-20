package com.hp.dao.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {
    //通过xml进行参数化
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
     System.out.println("名字："+name+"+年龄："+age);

    }

}
