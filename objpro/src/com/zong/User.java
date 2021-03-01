package com.zong;

public class User {
    int id;
    String name;
    String pwd;
    static String company = "浙江大学";
    public User(int id, String name){
        this.id = id;  //this避免代码的歧义
        this.name = name;
    }
    public User(int id,String name,String pwd){
        this(id,name);  //在一个构造器中调用重载的构造方法，使用this（）方法 ,必须位于构造方法的第一句。
        this.pwd = pwd;
    }
    public void login(){
        System.out.println("欢迎"+this.name);
        System.out.println("来自:"+company);  //可以调用静态信息
    }
    public  static void printCompany(){
        System.out.println(company);
        //login();  //静态方法中无法调用非静态属性和方法
    }

    //this 不能用于static方法中
    public static void main(String[] args) {
        User u1 = new User(100,"张三");
    }
}
