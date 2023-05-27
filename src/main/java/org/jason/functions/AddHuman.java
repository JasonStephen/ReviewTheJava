package org.jason.functions;

import org.jason.arrays.PeopleArray;
import org.jason.test.testNo4;


import java.util.Scanner;


public class AddHuman {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Debug
        System.out.println("\u001B[33m"+"[DEBUG]Now you are entered the AddHuman function"+"\u001B[0m");
        System.out.println("[INFO]关于需要录入的内容，请注意以下几点：");
        System.out.println("[INFO]1.练习生姓名不得为空");
        System.out.println("[INFO]2.练习生练习时长合法");
        System.out.println("[INFO]3.练习生爱好可以为空");
        System.out.println("\u001B[31m"+"[INFO]4.小组分配和座位分配的决定不可撤销"+"\u001B[0m");

        //分配小组和座位，以及练习生数量，并且判断练习生数量是否符合要求
        System.out.println("[INFO]请输入要录入的小组数");
        int group = scanner.nextInt();
        System.out.println("[INFO]请输入要录入的每组成员数量");
        int seat = scanner.nextInt();
        System.out.println("[INFO]请输入要录入的练习生数量");
        int peoplenum = scanner.nextInt();
        while(true){
            if (peoplenum>group*seat) {
                System.out.println("\u001B[31m"+"[ERROR]练习生数量超出限制，请重新输入"+"\u001B[0m");
                peoplenum = scanner.nextInt();
            }else if(peoplenum<(group-1)*seat){
                System.out.println("\u001B[31m"+"[ERROR]练习生数量不足，请重新输入"+"\u001B[0m");
                peoplenum = scanner.nextInt();
            }else{
                System.out.println("\u001B[34m"+"[SUCCESS]练习生数量符合要求"+"\u001B[0m");
                break;
            }
        }

        // 创建 PeopleArray 对象
        PeopleArray peopleArray = new PeopleArray(group, seat);
        testNo4[][] people = peopleArray.getPeople();

        //定义顺序i,j
        int i,j;
        //添加成员
        for(i=1;i<=group;i++)
        {
            for(j=1;j<=seat;j++)
            {
                //输入练习生姓名
                System.out.println("[INFO]请输入第"+i+"组第"+j+"位练习生的信息");
                System.out.println("[INFO]请输入这位练习生的姓名");
                people[i - 1][j - 1].setName(scanner.next());
                //输入练习生练习时长
                System.out.println("[INFO]请输入这位练习生的练习时长");
                people[i - 1][j - 1].setYear(scanner.nextDouble());
                verify_year:while(true){ //判断练习时长是否为负数
                    if (people[i - 1][j - 1].getYear() <0) {
                        System.out.println("\u001B[31m"+"[ERROR]练习时长不能为负数，请重新输入"+"\u001B[0m");
                        people[i - 1][j - 1].setYear(scanner.nextDouble());
                    }else{
                        System.out.println("\u001B[34m"+"[SUCCESS]练习时长符合要求"+"\u001B[0m");
                        break verify_year;
                    }
                }
                //输入练习生爱好
                System.out.println("[INFO]是否输入这位练习生的爱好？[Y/N]");
                String choice = scanner.next().toUpperCase();

                while (true) {
                    switch (choice) {
                        case "Y":
                            System.out.println("[INFO]请输入第" + i + "组第" + j + "位练习生的爱好");
                            people[i - 1][j - 1].setFavor(scanner.next());
                            break;
                        case "N":
                            System.out.println("[INFO]已跳过爱好录入");
                            break;
                        default:
                            System.out.println("[ERROR]输入错误，请重新输入");
                            choice = scanner.next().toUpperCase();
                            continue;
                    }
                    break;
                }
                testNo4.intro(); //调用testNo4类中的intro方法，输出最终结果
            }
        }
    }
}
