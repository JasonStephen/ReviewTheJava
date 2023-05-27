package org.jason.test;

public class testNo4 {
    private static String name;
    private static double year;
    private static String favor;

//    {
//        System.out.println("[INFO]调用testNo4");
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public String getFavor() {
        return favor;
    }

    public void setFavor(String favor) {
        this.favor = favor;
    }

    public static void intro(){
        System.out.println("大家好，ta是练习时长"+year+"年的练习生"+name+"，喜欢"+favor);
    }

}
