package com.zong.encapsulation;

public class Person {
    private String name;
    private  int age;
    private boolean flag;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
