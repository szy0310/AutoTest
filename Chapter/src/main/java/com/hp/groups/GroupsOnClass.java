package com.hp.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass {

    public void stu1() {
        System.out.println("GroupsOnClass中stu11111运行");
    }

    public void stu2() {
        System.out.println("GroupsOnClass中stu222运行");
    }


}
