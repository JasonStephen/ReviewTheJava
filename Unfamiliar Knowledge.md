<h1 style="text-align: center">不熟悉的知识点复习</h1>

---
## 一、第一章知识点
### 1.1 Java语言的特点
1. 简单易学
2. 面向对象
3. 安全性
4. 跨平台性
5. 支持多线程
6. 分布式

### 1.2 Java分为三个体系
1. JavaSE(Java Standard Edition)标准版
2. JavaEE(Java Enterprise Edition)企业版
3. JavaME(Java Micro Edition)小型版

---
## 二、Java编程基础
### 主要有疑问的内容包括

### 2.1 Java中的数据类型(P29-35)
- 整数型
    - byte 取值范围：-2^7~2^7-1
    - short 取值范围：-2^15~2^15-1
    - int 取值范围：-2^31~2^31-1
    - long 取值范围：-2^63~2^63-1
- 浮点数
    - float 声明方式：后面必须加上f或者F
    - double 声明方式：后面可以加上d或者D，也可以不加
- 布尔
- 字符
    - char 占用两个字节，可以用ASCII码表示,也可以用Unicode表示
- 字符串

### 2.2 变量的类型转换
- 自动类型转换(又称为隐式类型转换)
    - 要求：数据类型兼容(例如：int和byte兼容)
    - 目标类型大于源类型的取值范围(例如：int类型取值范围大于byte类型)
    - 整数类型之间可以实现转换
        - byte类型的数据可以赋值给short、int、long类型的变量
        - short、char类型的数据可以赋值给int、long类型的变量
        - int类型的数据可以赋值给long类型的变量
    - 整数类型转换为float类型
        - byte、char、short、int类型的数据可以赋值给float类型的变量。
    - 整数类型转换为double类型
        - byte、char、short、int、long、float类型的数据可以赋值给double类型的变量。


- 强制类型转换
    - 语法：(目标类型)变量名
    - 注意：强制类型转换会造成精度损失

### 2.3 方法
- 方法的定义
    - 语法：
        - 修饰符 返回值类型 方法名(参数类型 形式参数1,参数类型 形式参数2,...){
            执行语句;
            return 返回值;
        }
    - 说明：
        - 修饰符：public static
        - 返回值类型：方法执行完毕后返回的数据的类型
        - 方法名：符合命名规则即可
        - 参数类型：方法执行时传入的数据的类型
        - 形式参数：方法定义时用于接收外界传入的数据的变量
        - 执行语句：方法体
        - return：结束方法的执行，并将返回值带给调用者
        - 返回值：方法执行后返回的数据


- 方法的重载
    - 重载：在同一个类中，方法名相同，参数列表不同的方法，与返回值无关
    - 重载的好处：方便阅读，优化程序设计，提高程序的扩展性
    - 重载的特点：与返回值无关，只看参数列表
    - 重载的注意事项：方法名相同，参数列表不同，与返回值无关

---
## 三、数组
### 3.1 数组的定义
- 定义方法：
  - 动态初始化
    - 数据类型[] 数组名 = new 数据类型[数组长度];
    - 数据类型 数组名[] = new 数据类型[数组长度];
  - 静态初始化
    - 数据类型[] 数组名 = {元素1,元素2,...};
    - 数据类型[] 数组名 = new 数据类型[]{元素1,元素2,...};


- 不同数组类型下的默认值
    - 整数类型：0
    - 浮点类型：0.0
    - 字符类型：'\u0000' (一个空字符)
    - 布尔类型：false
    - 引用类型：null (表示变量不引用任何对象)

### 3.2 空指针异常
空指针异常是指引用类型的变量没有指向任何对象，而访问了对象的属性或者调用了对象的方法，就会发生空指针异常。


### 3.3 二维数组的静态初始化
举例：int[][] xx = {{1,2},{3,4,5,6},{7,8,9}};
含义：二维数组中有三个一维数组，第一个一维数组有两个元素，第二个一维数组有四个元素，第三个一维数组有三个元素
例如：xx[0][1] = 2; xx[1][3] = 6; xx[2][2] = 9;
    
代码示例：
```java
public class Example {
    public static void main(String[] args) {
        int[][] arr = new int[3][];          // 定义一个长度为3的二维数组
        arr[0] = new int[]{11, 12};         // 为数组的元素赋值
        arr[1] = new int[]{21, 22, 23};
        arr[2] = new int[]{31, 32, 33, 34};
        int sum = 0;                                        // 定义变量记录总销售额
        for (int i = 0; i < arr.length; i++) {         // 遍历数组元素
            int groupSum = 0;                   // 定义变量记录小组销售总额
            for (int j = 0; j < arr[i].length; j++) {// 遍历小组内每个人的销售额
                groupSum = groupSum + arr[i][j];
            }
            sum = sum + groupSum;    // 累加小组销售额
            System.out.println("第" + (i + 1) + "小组销售额为：" + groupSum + " 万元。");
        }
        System.out.println("总销售额为: " + sum + " 万元。");
    }
}
```
输出结果：
```
第1小组销售额为：23 万元。
第2小组销售额为：66 万元。
第3小组销售额为：130 万元。
总销售额为: 219 万元。
```

---
## 四、面向对象
### 4.1 面向对象的三大特征
- 封装
- 继承
- 多态

### 4.2 类与对象
#### 1. 类的定义格式： 
``` 
class 类名{
    属性;
    方法;
}
```

#### 2. 类中可以定义的内容：
- 属性：成员变量
- 方法：成员方法

代码示例：
```java
public class testNo4 {
    public static String name;
    public static double year;
    public static String favor;
    public static void intro(){
        System.out.println("大家好，ta是练习时长"+year+"年的练习生"+name+"，喜欢"+favor);
    }
}
```
### 4.3 对象的创建和使用
- 创建对象的格式：类名 对象名 = new 类名();
- 使用对象的格式：对象名.对象成员

  例如：testNo4[][] people = new testNo4[group][seat];
    
  代码示例：
  ```java
  class Student {
      String name;
      void read() {  
            System.out.println("大家好，我是" + name + ",我在看书!");
      }
  }
  public class Test {
      public static void main(String[] args[]) {  
            Student stu = new Student();         //创建并实例化对象
      }
  }
  ```

### 4.4 访问控制权限
- public：公共的
- private：私有的
- protected：受保护的
- default：默认的
   
  |  访问控制权限   | 同一个类中 | 同一个包的类 | 不同包的子类 | 全局范围 |
  |:---------:|:-----:|:------:|:------:|:----:|
  |  public   |   √   |   √    |   √    |  √   |
  | protected |   √   |   √    |   √    |  ×   |
  |  default  |   √   |   √    |   ×    |  ×   |
  |  private  |   √   |   ×    |   ×    |  ×   |

  代码块举例：
  ```java
   public class Test {
      public int aa;	//aa可以被所有的类访问
      protected boolean bb; //bb可以被所有子类以及本包的类访问
      void cc() { 	//默认访问权限，能在本包范围内问
          System.out.println("包访问权限");
      }
      //private权限的内部类，即这是私有的内部类，只能在本类中访问
      private class InnerClass {
      }
  }
  ```
   
  错误示例：
  ```java
  public class Test {
      void cc() { 		      //默认访问权限，能在本包范围内使用
          public int aa;                 //错误，局部变量没有访问权限控制
          protected boolean bb; //错误，局部变量没有访问权限控制
          System.out.println("包访问权限");
      }
      //private权限的内部类，即这是私有的内部类，只能在本类使用
      private class InnerClass {
      }
   }
  ```

### 4.5 封装与构造
#### 1. 封装
- 实现封装的步骤：
    - 将类中的属性设置为私有的
    - 提供公共的set和get方法来获取和设置属性值
    - 在set和get方法中加入属性控制语句

#### 2. 构造方法
- 构造方法的作用：创建对象

代码示例1：
```java
class Student{
    public Student() {  
        System.out.println("调用了无参构造方法");
    }
}
public class Example05 {
    public static void main(String[] args) {
        System.out.println("声明对象...");
        Student stu = null;         //声明对象
        System.out.println("实例化对象...");
        stu = new Student();     	//实例化对象
    }
}
```

输出结果：
```
声明对象...
实例化对象...
调用了无参构造方法
```

代码示例2：
```java
class Student{
    private String name;
    private int age;
    public Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("调用了有参构造");
    }
    public void read(){
        System.out.println("我是:"+name+",年龄:"+age);
    }
}
public class Example06 {
    public static void main(String[] args) {
        Student stu = new Student("张三",18); // 实例化Student对象
        stu.read();
    }
}
```

输出结果：
```
调用了有参构造
我是:张三,年龄:18
```

#### 3. 构造与封装的好处
- 构造方法可以保证对象的属性被正确的初始化,构造方法可以确保对象的属性被正确初始化，
并通过公共的 getter 和 setter 方法使私有属性可以被外部类访问和修改。
- 封装可以保证数据的安全性

#### 4. 构造方法的重载
代码示例：
```java
class Student {
    private String name;
    private int age;

    public Student() {System.out.println("调用了无参数的构造方法");}

    public Student(String n) {
        name = n;
        System.out.println("调用了一个参数的构造方法");
    }

    public Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("调用了两个参数的构造方法");
    }

    public void read() {
        System.out.println("我是:" + name + ",年龄:" + age);
    }
}

public class Example07 {
    public static void main(String[] args) {
        Studnet stu = new Student();         // 实例化Student对象
        Student stu1 = new Student("张三");   // 实例化Student对象
        Student stu2 = new Student("张三", 18);   // 实例化Student对象
        stu.read();
        stu1.read();
        stu2.read();
    }
}
```

输出结果：
```
调用了无参数的构造方法
调用了一个参数的构造方法
调用了两个参数的构造方法
我是:,年龄:0
我是:张三,年龄:0
我是:张三,年龄:18
```

#### 5. 构造块
示例代码：
```java
class Student{
   String name;    		//成员属性
   {
        System.out.println("我是构造代码块");       //与构造方法同级
    }
    //构造方法
    public Student() {
        System.out.println("我是Student类的构造方法");
    }
}
public class Example12 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
    }
}
```
输出结果：
```
我是构造代码块
我是Student类的构造方法
我是构造代码块
我是Student类的构造方法
```
注意：
- 构造块在创建对象时被调用，每创建一个对象就调用一次
- 位置不能错了，必须在构造方法的前面
   
### 4.6 this关键字
#### 1. this关键字的作用：指向当前对象
#### 2. this关键字的使用场景：
- 当<u>局部变量</u>和<u>成员变量</u>重名时，可以使用this关键字来区分
- 当构造方法中需要调用其他的构造方法时，可以使用this关键字来调用
- 当方法中需要返回当前对象时，可以使用this关键字来返回
#### 3. this关键字的使用格式：
- this.成员变量名
- this.成员方法名
- this(参数列表)
#### 4. this关键字的使用示例：
```java
class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void read() {
        System.out.println("我是:" + name + ",年龄:" + age);
    }
}
public class Example08 {
    public static void main(String[] args) {
        Student stu = new Student("张三", 18);   // 实例化Student对象
        stu.read();
    }
}
```

输出结果：
```
我是:张三,年龄:18
```

### 4.7 static关键字
#### 1. static修饰的属性，称为静态属性
    访问格式：类名.静态属性名
    static修饰的属性会变为公共属性，只分配一块内存空间，一旦某个对象对其进行了修改，全部对象的这个属性值都会变
    static不能修饰局部变量
代码示例：
```java
class Student {
    String name;                            // 声明name属性
    int age;                                // 声明age属性
    static String school = "A大学";          // 定义school属性
    // ...
}

public class Example14 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 18);        // 创建学生对象
        Student stu2 = new Student("李四", 19);
        Student stu3 = new Student("王五", 20);
        stu1.info();
        stu2.info();
        stu3.info();
        stu1.school = "B大学";
        stu1.info();
        stu2.info();
        stu3.info();
        // ...
    }
}
```
输出结果：
```
我是张三,今年18岁,在A大学上学
我是李四,今年19岁,在A大学上学
我是王五,今年20岁,在A大学上学
我是张三,今年18岁,在B大学上学
我是李四,今年19岁,在B大学上学
我是王五,今年20岁,在B大学上学
```

#### 2. static修饰的方法，称为静态方法
    访问格式：类名.静态方法名 或者 实例对象名.静态方法名

#### 3. 静态属性和静态方法的相似点
- 共享性：静态属性和静态方法都与类相关，而不是与类的实例相关。它们只有一份拷贝，被所有类的实例共享。
- 类级别访问：静态属性和静态方法可以直接通过类名进行访问，而无需创建类的实例。可以使用类名.属性名或类名.方法名的方式来访问静态成员。
- 生命周期：静态属性和静态方法的生命周期与类的生命周期相同。它们在类加载时被初始化，一直存在于内存中，直到程序结束或类被卸载。
- 对象无关性：静态属性和静态方法不依赖于类的实例，因此它们可以在没有创建类的实例的情况下使用。
- 类级别的操作：静态属性和静态方法可以用于执行与类本身相关的操作，例如统计类的实例数量、提供公共的工具方法等。

#### 4. 静态代码块
- 静态代码块在类加载时执行，只执行一次


### 4.8 继承
    - 构建出来的新类被称为子类
    - 现有类被称为父类，并继承属性使子类具有父类的特征和行为
    - 子类只能访问父类中的非私有属性和方法，只有public和protected修饰的属性和方法可以被子类访问
    - 子类不能同时继承两个父类，但是一个父类可以有多个子类
    - 继承可以是多层的，即子类可以继承父类的父类，某个类可以是父类也可以是子类
    - 子类可以重写父类的方法，但是不能重写父类的属性
    - 子类的权限不能比父类的更加严格，比如父类public，子类不能是private

#### 1. 继承的语法格式
```java
class 父类{
  
 }
class 子类 extends 父类{
  
}
```


### 4.9 super关键字
    - 在类中使用super访问父类的属性和方法，特别是被子类覆盖的方法
    - 正常状态下，子类对象无法访问父类中被子类覆盖的方法
    - super关键字可以在子类中访问父类的非私有方法、非私有属性以及构造方法
#### 1. 使用super关键字访问或调用父类的非私属性或非私有方法：
- super.属性
- super.方法(参数列表)

示例代码：
```java
// 定义Animal类
class Animal {		
    // 定义动物叫的方法		
    public void shout() {			  
        System.out.println("动物发出叫声");
    }
}

// 定义Dog类继承Animal类
class Dog extends Animal {    
    // 重写父类Animal中的shout()方法,扩大了访问权限
    public void shout() {			 
        super.shout();      // 调用父类中的shout()方法，并且输出System.out.println("动物发出叫声")
        System.out.println("汪汪汪……");  
    }
    
    public void printName(){
        System.out.println("名字:" + super.name);      // 访问父类中的name属性
    }
}

// 定义测试类
public class Example05 {
    public static void main(String[] args) {
        Dog dog = new Dog();    // 创建Dog类的对象
        dog.shout();                      // 调用Dog类重写的shout()方法
        dog.printName();                // 调用Dog类中的printName()方法
    }
}

```
输出结果：
```
动物发出叫声
汪汪汪……
名字：牧羊犬
```

#### 2. 使用super关键字调用父类的构造方法
- super(参数列表)

#### 3。 Super和This区别关系表格
|  关键字  |    调用构造方法    |  调用方法   |     访问属性     |
|:-----:|:------------:|:-------:|:------------:|
| super | 必须放在构造方法的第一行 | 可以在任何位置 | 可以访问父类的非私有属性 |
| this  | 必须放在构造方法的第一行 | 可以在任何位置 | 可以访问本类的非私有属性 |

#### 4. 注意事项，super和this不能同时出现在一个构造方法中


### 4.10 final关键字
#### 1. final与继承之间的关系
- final关键字可以修饰类、属性和方法
- final修饰的类不能被继承
- final修饰的方法不能被重写

#### 2. final与赋值之间的关系
- final修饰的属性不能被修改，即不能被重新赋值
- final修饰的属性必须在定义时或构造方法中进行初始化赋值，不能在其他方法中赋值
- final修饰的属性一般和static关键字一起使用，称为常量，常量名一般使用`大写字母`
- final修饰的属性一般使用public static final修饰，称为全局常量，全局常量可以直接通过类名访问
    - public static final String NAME = "哈士奇";
- final修饰的属性一般使用private static final修饰，称为私有常量，私有常量只能在本类中访问

### 4.11 抽象类
#### 1. 抽象类的概念
- 抽象类是用abstract关键字修饰的类，抽象类不能被实例化，即不能创建对象

#### 2. 抽象类的特点
- 抽象类不能被实例化，即不能创建对象
- 抽象类中可以包含抽象方法，也可以包含非抽象方法

#### 3. 抽象类的语法格式
abstract 返回值类型 方法名称(参数列表);

```java
abstract class 抽象类名称{
    属性;
    访问权限 返回值类型 方法名称(参数){                    //普通方法
        return [返回值];
    }
    访问权限 abstract 返回值类型 抽象方法名称(参数);//抽象方法，无方法体
}
```

#### 4. 抽象类的定义规则
1) 包含抽象方法的类必须是抽象类。
2) 声明抽象类和抽象方法时都要使用abstract关键字修饰。
3) 抽象方法只需声明而不需要实现。
4) 如果非抽象类继承了抽象类，那么该类必须实现抽象类中的全部抽象方法。

