package com.zong.inherit;

public class Person { //extends Object
    String name;
    int height;
    public void rest(){
        System.out.println("rest in office");
    }


    public static void main(String[] args) {
        Student s = new Student("张三",180,99);
        Student s2 = new Student("李四");
        s.rest();
        s2.rest();
        Person p =new Person();
        p.rest();
    }

}
class Student extends Person{
    int score;
    public void study(){
        System.out.println("study"+this.name);
    }
    public void rest(){
        System.out.println("rest in classroom"+this.name);
    }
    Student(String name,int height,int score){
        this.name = name;
        this.height = height;
        this.score = score;

    }
    Student(String name){
        this.name = name;
    }
}
