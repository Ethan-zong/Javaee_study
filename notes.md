JAVA学习笔记
 

 

# 基础内容


``` java
public class Helloworld{
	public static void main(String[] args){
	System.out.println("Hello world");
	}
}
```

-----
常量分为字符串常量（Hello world）、整数常量、小数常量、字符常量、布尔常量和空常量。
**空常量不能输出 **



## 数据类型

1B（字节）=8 bit
1KB=1024B
1MB=1024KB
数据类型分为基本数据类型和引用数据类型。  
基本数据类型：数值型和非数值型。  
数值型：
1. byte,short,int ,long整数  
2. float,double浮点数  
3. char 字符
非数值型只有boolean,布尔。  

引用数据类型：
1. class 类
2. interface 接口
3. [  ] 数组
定义变量

```java
int a =10;  //定义变量
System.out.println(a);  // 输出变量
long l=10000000L;  // long类型
float f=13.14F;  //float 类型
```
## 标识符
1. 由数字，字母，下划线和美元符$组成。
2. 不能以数字开头
3. 不能是关键字
4. 区分大小写

firstName 小驼峰命名法--->方法，变量  
GoodStudent 大驼峰命名法--->类

## 类型转换
自动类型转换和强制类型转换。  
自动类型转换只能从小范围到大范围。  
byte->short->int->long->float->double  
char->int  
强制类型转换是将不能自动转换的转换。  
```java
int k=(88.88);
System.out.println(k);  //88
```
## 运算符
/-----------------除  
%--------------取余  
int类型相除只能得到int型。  
有浮点数参与相除就可以获得浮点数。  

字符“+”操作
```java
int i=10;
char c='A';
System.out.println(i+c);  //75
// 字符型ASCII
// A = 65 
// a =97
//0 =48
```
算术表达式中包含多个基本数据类型时，整个算术表达式的类型会自动进行提升。
byte，short，char->int->long->long->float->double

字符串“+”操作
```java
System.out.println("hello"+"world");  //拼接字符串
System.out.println("hello"+6+66);  // hello666
System.out.println(6+14+"hello");  //20hello
```
多个数据类型相加依次进行。
```java
short s = 10;
s+=20;  //s=30
//+= 包含了强制类型转换。
// s = s+20;  会报错，因为s是short类型。
```

自增自减运算符
```java
int i =10;
i++;   //i=11  运算时先用后加
++i;   // 运算时先加后用
```
&和  
&&短路和  
|或  
|| 短路或  
^异或  
！非  

三元运算符  
a>b?a:b  

## 控制流程

if...else  
if...else if...else if...else
switch  
for  
```java
//99乘法表
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
```

带标签的break和continue
```java
//打印2-100之间质数
outer:for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    continue outer;
                }

            }
            System.out.print(i + " ");
        }
}
```
while

## 方法
注意变量作用域  
### 输入
```java
Scanner scanner = new Scanner(System.in);
//构造一个Scanner对象，并与“标准输入流”System.in关联
//获取输入内容
String name = scanner.nextline();  //获取下一行
String firstName = scanner.next();  //获取下一个空格前
int age = scanner.nextInt();
boolean hasNextInt();  //检查是否还有下一个整数
```
scanner读取数字后再读取下一行直接跳过问题  
原因：  
当你在输入数字后，会将换行符保存到缓冲区，但是因为nextInt()方法不会读取换行符，使用nextLine()时会读取换行符直接跳过。  
解决方法：  
在nextLine()方法前读取一次。再进行正常读取操作。

引用类型使用equals方法，以及和“==”区别:  
```java
    String a = "Hello World";
    String b = new String("Hello World");
    String c = b;   //引用传递
    System.out.println("a == b:" + a == b);  //false
    System.out.println("b == c:" + b == c);  //true
    System.out.println("a == c:" + a == c);  //false
    System.out.println("a.equals(b):" + a.equals(b));  //true
    System.out.println("b.equals(c):" + b.equals(c));  //true
    System.out.println("a.equals(c):" + a.equals(c));  //true

```
==在比较引用类型时，比较的是地址。equals比较的是地址内容。  

### 递归
```java
/**
 * 打印斐波那锲数列 n=(n-1)+(n-2)
 */

public class Function02 {
    public static int fei(int n){
        if (n==2){
            return 2;
        }else if (n==1){
            return 1;
        }else{
            return fei(n-2)+fei(n-1);
        }
    }
    public static void main(String[] args) {
        for (int i =1;i<10;i++){
            System.out.println(fei(i));
        }
    }
}

```
# 面向对象

## 类和对象

### 构造方法

构造方法也叫构造器（constructor），用于对象初始化。  
1. 通过new调用
2. 有返回值，但是不能定义返回值。
3. 如果类没有写构造方法，编译器会自动生成一个无参数的构造方法，如果有写就会使用代码里的。
4. 构造器必须与类名一致。

```java
/**
 * 类包含属性，方法，构造方法
 */
public class Student {
    int id;
    String sName;
    int age;


    void study() {
        System.out.println("我正在学习");
    }
    //构造方法
    /*Student(){  //无参的构造方法

    }*/
    Student(int _id,String _sName,int _age){
        id=_id;
        sName=_sName;
        age=_age;
    }

    public static void main(String[] args) {
        Student s = new Student(1,"张三",18);
        s.study();
        System.out.println(s.id+s.sName+s.age);
    }
}


```
### 关键字
**this**  
this的本质是创建好的对象的地址。  
对象创建步骤：
1. 分配对象空间，并将对象成员变量初始化为0或空。
2. 执行属性值的显式初始化。
3. 执行构造方法。
4. 返回对象的地址给相关变量。

```java
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
        System.out.println("来自:"+company);
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

```
**static**  
普通的变量和方法储存在堆区。  
static修饰的变量和方法放在方法区。    
概要：
1. static修饰的变量和方法放在方法区。类的代码也在方法区。这些内容当程序执行时就会被加载。
2. 当一个类实例化一个对象后，会在堆里放入类包含的变量和方法，同时初始化变量（构造器）。并且将这块空间的的地址存放到栈里。
3. 所以static修饰的方法无法调用类的普通成员变量，因为即使这个类没有实例化对象，也可以用static的方法。
4. 但是普通方法可以调用static修饰的变量，因为在对象实例化之前，类的信息（包含static）已经被加载进方法区。

**final**
1. 修饰变量，一旦赋予初值，不再能重新赋值。
2. 修饰方法，不可被子类重写，但可以重载。
3. 修饰类，不能被继承。

### 变量的分类
|类型|位置|从属于|生命周期|
|---|---|---|---|
|局部变量|方法或语句块内|方法或语句块|从声明位置开始，直到方法或语句块执行完毕|
|成员变量|类内部，方法外部|对象|对象创建到对象消失|
静态变量|类内部，static修饰|类|类被加载，静态变量就有效，类被卸载，静态变量就消失|
### 包和导入
```java
import static java.lang.Math
//可以通过static导入类的静态属性和静态方法
```
# 继承，封装，多态

## 继承
子类可以继承父类的所有属性，方法。但是不一定可以直接访问。  
如果一个类没有继承，默认继承OBject类。  
单继承，一个子类只有一个直接父类。  
### 重载和重写
重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。最常用的地方就是构造器的重载。

重写是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。
```java
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
    public void rest(){  //重写rest()方法
        System.out.println("rest in classroom"+this.name);
    }
    Student(String name,int height,int score){
        this.name = name;
        this.height = height;
        this.score = score;

    }
    Student(String name){  //重载构造方法
        this.name = name;
    }
}

```



### 组合
```java
package com.zong.inherit;

public class Animal {
    public static void main(String[] args) {
        Taidi t = new Taidi();
        t.dog.shot();  //汪汪汪
    }
}

class Dog extends Animal{
    public void shot(){
        System.out.println("汪汪汪");
    }
}
class Taidi {
    Dog dog = new Dog();  //Taidi类可以使用Dog类的变量和方法。
}
```
## Object类

### tostring
```java
package com.zong.test;

public class User {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user);
        System.out.println(user.toString());  //两种方法一样
    }

}
/*输出：
com.zong.test.User@723279cf
com.zong.test.User@723279cf
*/
```

### equals()
上面讲过引用类型的equals方法。属于string类里对equals的重写。  
默认equals方法返回“Object@hashcode”,即类名@地址。


### super
直接父类对象的引用。通过super来访问父类中被子类覆盖的方法或属性。  
```java
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
/*
FatherClass build
ChildClass build
FatherClass.value=100
ChildClass.value=50
50
100
*/
```
## 封装（encapsulation）
### 访问修饰符
|修饰符|同一类|同一包|子类|所有类|
|---|---|---|---|---|
|private|ok||||
|default|ok|ok|||
|protected|ok|ok|ok||
|public|ok|ok|ok|ok|
```java
package com.zong.encapsulation.a;

public class Father {
    //父类
    private int testPrivate = 100;
    int testDefault = 200;
    protected int testProtected = 300;
    public int testPublic = 400;
    protected static void run(){
        System.out.println("run");
    }
}


package com.zong.encapsulation.a;

public class Child extends Father{
    //Father的子类
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.testDefault);  //同包子类可以访问到父类的非private属性和方法
        System.out.println(father.testProtected);
    }
}


package com.zong.encapsulation.a;

public class Mother {
    //Father的同包非子类
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.testDefault);  //同包非子类也可以访问非private
        System.out.println(father.testProtected);
    }

}


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
        father.run();  //可以访问static修饰的成员
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
```

### 封装细节
#### javabean
```java
package com.zong.encapsulation;

public class Person {
    private String name;
    private  int age;
    private boolean flag;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
```
## 多态
多态指的是同一个方法调用，由于对象不同可能会有不同的行为。
1. 多态是方法的多态。
2. 继承，方法重写，父类引用指向子类对象。
3. 父类引用调用子类重写的方法。

```java
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
```
子类重写了父类的方法，为了降低程序耦合性，在animalCry使用多态性，即使之后Animal产生新类，也重写了shout方法。但是在使用时依旧可以用animalCry方法。完成调用。  


### 对象的转型
```java
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

//引用可以用指针理解
```

# 抽象类和接口

## 抽象方法
使用abstract修饰的方法，没有方法体，只有声明。 

## 抽象类
1. 有抽象方法的类只能定义成抽象类。
2. 抽象类不能实例化。 
3. 抽象类可以包含属性，方法，构造方法。
4. 抽象类只能被继承。 
5. 抽象方法必须被子类实现。（重写）
```java
package com.zong.abstractClass;

public abstract class Student {
    private int id;
    private String name;

    public abstract void study();

    public int getId() {  //可以正常声明方法
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



package com.zong.abstractClass;



public class Test {
    public static void main(String[] args) {
        Student s2 = new College();
        s2.study();
    }
}
class College extends Student{
    public void study(){
        System.out.println("library");  //必须实现
    }
}

```

## 接口 interface

接口是一个规范。  
接口的成员默认为 public static final类型，方法默认为 public abstract 类型的。
```java
interface Volant{
    //接口可以继承多个接口
    int FLY_HEIGHT = 100;  //常量
    void fly();  // 抽象方法 只能定义这两个
}
```
接口需要类实现。
```java
Class Angel implements Volant{
    //用类来实现接口,一个类可以实现多个接口（类似多继承，但是java中不能多继承）。
    public void fly(){
        System.out.println("我是天使，可以飞");
    }
}
```
## JDK8以后可以定义的静态方法和默认方法

### 默认方法（扩展方法）
```java
default void moren(){
    System.out.println("接口A的默认方法")
    // 必须加defult关键字，其他和父类相似，可以被实现的类重写，也可以不重写。
}
```
### 静态方法
可以在接口中直接定义静态方法。接口也是一种类。通过接口名调用。
```java
package com.zong.abstractClass;

public class Test_interface {
    public static void main(String[] args) {
        A.staticMethod();  //静态方法通过类名直接调用
        Test_A.staticMethod();
    }
}
interface A{
    public static void staticMethod(){
        //和类的静态方法一样
        System.out.println("A.staticMethod");
    }
}
class Test_A implements A{
    public static void staticMethod(){
        //重写
        System.out.println("Test_A.staticMethod");
    }
}
```