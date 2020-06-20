package com.hp.dao.suite;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig  {
    //测试套件
   @BeforeSuite
    public  void beforeSuit(){

        System.out.println("beforSuit运行了");
    }
    @AfterSuite
   public void afterSuite(){

       System.out.println("afterSuite运行了");
   }
   //
   @BeforeTest
   public  void beforeTest(){
       System.out.println("beforeTest");

   }
   @AfterTest
   public void aftertest(){
       System.out.println("aftertest");
   }


}
