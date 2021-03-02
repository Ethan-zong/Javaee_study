package com.zong.test;

/**
 * "=="和"equals()"
 */

public class Test01 {


    public static void main(String[] args) {
        String a = "Hello World";
        String b = new String("Hello World");
        String c = b;   //引用传递
        System.out.println("a == b:" + a == b);  //false
        System.out.println("b == c:" + b == c);  //true
        System.out.println("a == c:" + a == c);  //false
        System.out.println("a.equals(b):" + a.equals(b));  //true
        System.out.println("b.equals(c):" + b.equals(c));  //true
        System.out.println("a.equals(c):" + a.equals(c));  //true
    }
}
