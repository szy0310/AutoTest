package com.hp.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass2 {
    public void teacher1() {
        System.out.println("GroupsOnClass2中teacher11111运行");
    }

    public void teacher2() {
        System.out.println("GroupsOnClass2中teacher222运行");
    }
}
