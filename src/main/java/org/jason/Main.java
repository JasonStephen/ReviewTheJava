package org.jason;
import org.jason.test.testNo4;
import org.jason.verify.human;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //定义二位数组，小组数量和小组成员数量以及练习生数量
        Scanner scanner = new Scanner(System.in);
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
                System.out.println("[INFO]请输入第"+i+"组第"+j+"位练习生的姓名");
                people[i-1][j-1].name = scanner.next();
                boolean verify = false;
                verify_human:while(true){ //判断练习生名字是否重复
                    verify = false;
                    for (int x = 0; x < i; x++) {
                        for (int y = 0; y < j; y++) {
                            if (people[x][y].name.equals(people[i-1][j-1].name)) {
                                verify = true;
                                break verify_human;
                            }
                        }
                    }
                    if (verify) {
                        System.out.println("[ERROR]姓名重复，请重新输入");
                        people[i-1][j-1].name = scanner.next();
                    } else {
                        System.out.println("[SUCCESS]姓名符合要求");
                        break verify_human;
                    }
                }

                System.out.println("[INFO]请输入第"+i+"组第"+j+"位练习生的练习时长");
                people[i-1][j-1].year = scanner.nextDouble();
                verify_year:while(true){ //判断练习时长是否为负数
                    if (people[i-1][j-1].year<0) {
                        System.out.println("[ERROR]练习时长不能为负数，请重新输入");
                        people[i-1][j-1].year = scanner.nextDouble();
                    }else{
                        System.out.println("[SUCCESS]练习时长符合要求");
                        break verify_year;
                    }
                }

                System.out.println("[INFO]请输入第"+i+"组第"+j+"位练习生的爱好");
                people[i-1][j-1].favor = scanner.next();

                testNo4.intro(); //调用testNo4类中的intro方法，输出最终结果
            }
        }
        scanner.close();
    }
}