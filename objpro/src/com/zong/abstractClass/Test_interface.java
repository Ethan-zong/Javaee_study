package com.zong.abstractClass;

public class Test_interface {
    public static void main(String[] args) {
        A.staticMethod();
        Test_A.staticMethod();
    }
}
interface A{
    static void staticMethod(){
        System.out.println("A.staticMethod");
    }
}
class Test_A implements A{
    public static void staticMethod(){
        System.out.println("Test_A.staticMethod");
    }
}
