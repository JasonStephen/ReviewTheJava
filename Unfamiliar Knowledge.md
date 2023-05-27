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

### 3. 运算符


