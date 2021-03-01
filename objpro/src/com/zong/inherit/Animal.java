package com.zong.inherit;

public class Animal {
    public static void main(String[] args) {
        Taidi t = new Taidi();
        t.dog.shot();
    }
}

class Dog extends Animal{
    public void shot(){
        System.out.println("汪汪汪");
    }
}
class Taidi {
    Dog dog = new Dog();
}
