package com.hp.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

//组测试
public class GrouopsOnMethod {

    @Test(groups= "server")
    public void test1(){
        System.out.println("测试组1");
    }

    @Test(groups= "server")
    public void test2(){
        System.out.println("测试组2");
    }
    @Test(groups= "client")
    public void test3(){
        System.out.println("本地测试组1");
    }
    @Test(groups= "client")
    public void test4(){
        System.out.println("本地测试组2");
    }


    @BeforeGroups("server")
    public void  befereGroupsOnServer(){

        System.out.println("测试组运行之前运行数据");
   }

   @AfterGroups( "server")
   public void  afterGroupOnServer(){

        System.out.println("测试组运行之后运行数据!!!!");
   }

}
