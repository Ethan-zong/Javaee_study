package com.zong;

/**
 * 类包含属性，方法，构造方法
 */
public class Student {
    int id;
    String sName;
    int age;


    void study() {
        System.out.println("我正在学习");
    }
    //构造方法
    Student(){  //无参的构造方法

    }
    Student(int id,String sName,int age){  //构造方法的重载，也是有参的构造方法
        this.id=id;
        this.sName=sName;
        this.age=age;
    }

    public static void main(String[] args) {
        Student s = new Student(1,"张三",18);
        s.study();
        System.out.println(s.id+s.sName+s.age);
        Student s2 = new Student();
        System.out.println(s2.id);  //初始化为0，NULL

    }
}
