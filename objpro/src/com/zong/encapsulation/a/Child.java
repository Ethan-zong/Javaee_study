package com.zong.encapsulation.a;

public class Child extends Father{
    //Father的子类
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.testDefault);  //同包子类可以访问到父类的非private属性和方法
        System.out.println(father.testProtected);
    }
}
