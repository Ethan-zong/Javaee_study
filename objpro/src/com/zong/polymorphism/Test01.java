package com.zong.polymorphism;

public class Test01 {
    static void animalCry(Animal animal){
        animal.shout();  //多态
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        animalCry(dog);  //根据传入不同的Animal的子类对象，调用不同的方法。
        animalCry(new Cat());
        Animal a = new Dog();  //向上转型，父类引用调用子类对象
//        a.seeDoor();  // 不能使用，因为a向上转型为Animal类
        a.shout();  // 汪汪汪  父类类型的引用
        //Cat c1 = (Cat) a;  //报错，dog和cat类是同级的
        Dog d1 = (Dog) a;
        d1.seeDoor();
    }
}
