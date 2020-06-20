package com.hp.dao.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    //测试分组
    @Test(groups = "server")
    public  void test1(){
      System.out.println("这是服务器组的测试方法1");
    }
    @Test(groups = "server")
    public  void test2(){
        System.out.println("这是服务器组的测试方法2");
    }
    @Test(groups = "client")
    public  void test3(){
        System.out.println("这是客户端的测试方法1");
    }
    @Test(groups = "client")
    public  void test4(){
        System.out.println("这是客户端的测试方法2");
    }

//    @BeforeGroups("server")
//    public void beforeGroups(){
//        System.out.println("这个时测试服务器运之前的运行的方法");
//
//    }
//    @AfterGroups("server")
//    public void afterGroups(){
//        System.out.println("这个时测试服务器运之后的运行的方法");
//
//    }

    @BeforeGroups("client")
    public void beforeGroups(){
        System.out.println("这个时测试客户端运之前的运行的方法");

    }
    @AfterGroups("client")
    public void afterGroups(){
        System.out.println("这个时测试客户端运之后的运行的方法");

    }



}
