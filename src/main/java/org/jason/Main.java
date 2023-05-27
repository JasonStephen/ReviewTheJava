package org.jason;
import org.jason.functions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //定义二位数组，小组数量和小组成员数量以及练习生数量
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到主菜单，请输入你想要实现的功能:");
        System.out.println("1.录入练习生信息");
        System.out.println("2.查看练习生信息");
        System.out.println("0.退出系统");
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
                AddHuman.main(args);
                break;
            case 2:
                ScanHuman.main(args);
                break;
            case 0:
                System.out.println("感谢使用本系统，再见");
                break;
        }
        scanner.close();
    }
}