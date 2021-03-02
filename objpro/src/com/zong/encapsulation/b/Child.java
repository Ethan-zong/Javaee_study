package com.zong.encapsulation.b;

import com.zong.encapsulation.a.Father;

public class Child extends Father {
    //Father非同包子类
    void getFatherProtected(){
        //子类通过super直接访问父类的protected成员，但是不能访问父类对象的protected成员.
        System.out.println(super.testProtected);  //非同包子类可以通过super访问到Protected
    }
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.testPublic);  //非同包子类可以直接访问父类public
        Child child = new Child();
        child.getFatherProtected();
        father.run();  //可以访问static修饰的成员 会报warning
    }
}
/*
我的理解：
private 限制范围为这个类。
default 限制范围为这个包。
protected 限制的是继承。继承的本质是子类继承父类，而不是父类的对象。所以非同包子类只能直接访问在方法区的成员（super方法访问，static可以访问），
而子类创建的父类对象不能访问。
所以，父类和子类在同一包中，子类可以访问父类的protected成员，也可以访问父类对象的protected成员（同包就可以）。
父类和子类不在同一包中，子类可以访问父类的protected成员（继承），但是不可以访问父类对象的protected成员。
这段为自己理解，不知道正确与否。
 */