package com.hp.paramter;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

class DataProvider1 {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
      System.out.println("name="+name+";age"+age);

    }
  @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] lisd=new Object[][]{
                {"张三",12},
                {"张三1",22},
                {"张三2",32}
        };
        return lisd;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1++++name"+name+"; age"+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2++++++name"+name+"; age"+age);
    }


    @DataProvider(name = "methodData")
    public Object[][] methodData(Method method){

        Object[][] of=null;
        if (method.getName().equals("test1")){

            of=new Object[][]{
                    {"test111",12},
                    {"test1张三",122},
                    {"test1李四",123},
                    {"test1张武",124}

            };
        }else if (method.getName().equals("test2")){
            of=new Object[][]{
                    {"test211",12},
                    {"test2张三",122},
                    {"test3李四",123},
                    {"test4张武",124}

            };
        }
        return of;
    }


}
