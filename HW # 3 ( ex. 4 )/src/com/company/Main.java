package com.company;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        person[] prs = new person[4];
        prs[0] = new person("Maksym", 2001);
        prs[1] = new person("Nazar", 2002);
        prs[2] = new person("Igor", 1968);
        prs[3] = new person("Orest", 1975);

        for(int i = 0; i < prs.length; i++){
            prs[i].personInfo();
            System.out.println();
        }
    }
}
//////////////////////////////////////////////////////////////////////////////

class person{
    private String name;
    private int birthYear;
    private int age;
    public person(){}

    public person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }
    public void сhangeName(String name) { this.name = name; }
    public int age(){
        Calendar cal = Calendar.getInstance();
        int age = cal.get(Calendar.YEAR) - birthYear;
        return age;
    }


    public void personInfo(){
        System.out.println("My name is : "+name + " \nMy age : "+age());
    }
}