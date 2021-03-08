package com.zong.abstractClass;



public class Test {
    public static void main(String[] args) {
        Student s2 = new College();
        s2.study();
    }
}
class College extends Student{
    public void study(){
        System.out.println("library");
    }
}
