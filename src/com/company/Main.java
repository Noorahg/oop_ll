package com.company;

public class Main {

    public static void main(String[] args) {
        Class class1=new Class(56,"play",new int[]{7,9,45,7});
        System.out.println(class1.getNum());
        System.out.println(class1.getWord());
       for(int a: class1.getMyarr()){
           System.out.println(a+" ");
       }
        System.out.println(class1.toString());
    }
}
