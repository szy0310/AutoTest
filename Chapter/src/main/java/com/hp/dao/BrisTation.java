package com.hp.dao;

import org.testng.annotations.*;

public class BrisTation {
//最基本的注解    用来把方法标记为测试的一部分
    @Test
    public void testCase1() {
      System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){
       System.out.println("这是测试用例2");
    }


    @BeforeMethod
     public  void zhiqian(){
        System.out.println("测试方法之前以循行的");
}
@AfterMethod
public void zhuihou(){
        System.out.println("在方法之后运行");
   }


//类测试
    @BeforeClass
    public void lei(){
        System.out.println("类之前运行");
    }

    @AfterClass
    public void lei1(){
        System.out.println("类之后运行");
    }

    //测试套件
@AfterSuite
    public  void afforSuite(){
    System.out.println("afforSuite测试套件");

}
//在他们之前运行
@BeforeSuite
public void beforSuite(){
    System.out.println("beforSuite测试套件");


}

}
