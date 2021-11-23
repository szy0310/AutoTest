package com.hp.testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *测试注解运行顺序
 */

public class BasicAnnotation {
    @Test
    public void testCase1(){

        System.out.println("testCase1这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("testCase2这个是测试方法2");
    }


    @BeforeMethod
     public  void BeforeMethod(){
     System.out.println("BeforeMethod在测试方法之前运行");

    }

    @AfterMethod
    public void AfterMethod() {

        System.out.println("AfterMethod在测试方式之后运行");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass在类之气前运行");
    }

    @AfterClass
    public void AfterClass(){

        System.out.println("AfterClass在类之后进行运行");
    }


    @BeforeSuite
    public void BeforeSuite(){
    System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite套件测试");
    }

    @BeforeTest
    public void BeferTest(){
        System.out.println("BeferTest运行");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest运行");
    }



}
