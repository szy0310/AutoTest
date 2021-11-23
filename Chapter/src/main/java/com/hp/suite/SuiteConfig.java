package com.hp.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforSuite运行了");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("AftrerSuite运行了");
    }

    @BeforeTest
    public void  Beferetest() {

        System.out.println("BeferTest运行");
    }
    @AfterTest
    public void Aftertest(){
    System.out.println("AfterTest运行了");
    }

}
