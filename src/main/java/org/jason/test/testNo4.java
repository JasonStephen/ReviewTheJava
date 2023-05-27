package org.jason.test;

public class testNo4 {
    public static String name;
    public static double year;
    public static String favor;

    public static void intro(){
        System.out.println("大家好，ta是练习时长"+year+"年的练习生"+name+"，喜欢"+favor);
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        testNo4.name = name;
    }

    public static double getYear() {
        return year;
    }

    public static void setYear(double year) {
        testNo4.year = year;
    }

    public static String getFavor() {
        return favor;
    }

    public static void setFavor(String favor) {
        testNo4.favor = favor;
    }
}
