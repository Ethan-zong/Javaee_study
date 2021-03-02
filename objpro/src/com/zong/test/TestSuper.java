package com.zong.test;

public class TestSuper {
    public static void main(String[] args) {
        new ChildClass().f();
    }

}
class FatherClass{
    public int value;
    public void f(){
        value = 100;
        System.out.println("FatherClass.value="+value);
    }
    public FatherClass(){
        System.out.println("FatherClass build");
    }
}
class ChildClass extends FatherClass{
    public int value;
    public void f(){
        super.f();  //调用FatherClass.f()
        value = 50;
        System.out.println("ChildClass.value="+value);
        System.out.println(value);  //50
        System.out.println(super.value);  //100
    }
    public ChildClass(){
        //super();   //子类的构造方法会在默认的情况下在第一行使用父类的无参构造方法。类似构造器重载的this();
        System.out.println("ChildClass build");
    }
}
