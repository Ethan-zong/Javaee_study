package com.zong.polymorphism;

public class Test01 {
    static void animalCry(Animal animal){
        animal.shout();  //多态
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        animalCry(dog);
        animalCry(new Cat());
    }
}
