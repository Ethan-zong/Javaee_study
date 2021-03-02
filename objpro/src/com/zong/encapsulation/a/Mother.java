package com.zong.encapsulation.a;

public class Mother {
    //Father的同包非子类
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.testDefault);  //同包非子类也可以访问非private
        System.out.println(father.testProtected);
    }

}
