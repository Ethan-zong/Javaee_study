package com.zong.polymorphism;

public class Animal {
    public void shout(){
        System.out.println("叫了一声");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }
}
