# JAVA学习笔记
 

 

## 基础内容


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



### 数据类型

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
### 标识符
1. 由数字，字母，下划线和美元符$组成。
2. 不能以数字开头
3. 不能是关键字
4. 区分大小写

firstName 小驼峰命名法--->方法，变量
GoodStudent 大驼峰命名法--->类

### 类型转换
自动类型转换和强制类型转换。
自动类型转换只能从小范围到大范围。
byte->short->int->long->float->double
char->int
强制类型转换是将不能自动转换的转换。
```java
int k=(88.88);
System.out.println(k);  //88
```
### 运算符
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

### 控制流程

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

### 方法
注意变量作用域  
#### 输入
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
#### 递归
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
## 面向对象

### 类和对象

#### 构造方法

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
#### 关键字
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

#### 变量的分类
|类型|位置|从属于|生命周期|
|---|---|---|---|
|局部变量|方法或语句块内|方法或语句块|从声明位置开始，直到方法或语句块执行完毕|
|成员变量|类内部，方法外部|对象|对象创建到对象消失|
静态变量|类内部，static修饰|类|类被加载，静态变量就有效，类被卸载，静态变量就消失|
#### 包和导入
```java
import static java.lang.Math
//可以通过static导入类的静态属性和静态方法
```
### 继承，封装，多态

