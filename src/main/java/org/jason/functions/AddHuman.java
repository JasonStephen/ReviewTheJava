package org.jason.functions;
import org.jason.test.testNo4;
import org.jason.verify.human;

import java.util.Scanner;

public class AddHuman {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("[INFO]请输入要录入的小组数");
        int group = scanner.nextInt();
        System.out.println("[INFO]请输入要录入的每组成员数量");
        int seat = scanner.nextInt();
        System.out.println("[INFO]请输入要录入的练习生数量");
        int peoplenum = scanner.nextInt();
        while(true){
            if (peoplenum>group*seat) {
                System.out.println("[ERROR]练习生数量超出限制，请重新输入");
                peoplenum = scanner.nextInt();
            }else if(peoplenum<(group-1)*seat){
                System.out.println("[ERROR]练习生数量不足，请重新输入");
                peoplenum = scanner.nextInt();
            }else{
                System.out.println("[SUCCESS]练习生数量符合要求");
                break;
            }
        }
        //定义数组
        testNo4[][] people = new testNo4[group][seat];

        //定义顺序i,j
        int i,j;
        //添加成员
        for(i=1;i<=group;i++)
        {
            for(j=1;j<=seat;j++)
            {
                //输入练习生姓名
                System.out.println("[INFO]请输入第"+i+"组第"+j+"位练习生的姓名");
                people[i - 1][j - 1].setName(scanner.next());
                //输入练习生练习时长
                System.out.println("[INFO]请输入第"+i+"组第"+j+"位练习生的练习时长");
                people[i - 1][j - 1].setYear(scanner.nextDouble());
                verify_year:while(true){ //判断练习时长是否为负数
                    if (people[i - 1][j - 1].getYear() <0) {
                        System.out.println("[ERROR]练习时长不能为负数，请重新输入");
                        people[i - 1][j - 1].setYear(scanner.nextDouble());
                    }else{
                        System.out.println("[SUCCESS]练习时长符合要求");
                        break verify_year;
                    }
                }
                //输入练习生爱好
                System.out.println("[INFO]请输入第"+i+"组第"+j+"位练习生的爱好");
                people[i - 1][j - 1].setFavor(scanner.next());

                testNo4.intro(); //调用testNo4类中的intro方法，输出最终结果
            }
        }
    }
}
