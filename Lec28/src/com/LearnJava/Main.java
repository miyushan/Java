package com.LearnJava;

public class Main {

    public static void main(String[] args) {
        char c1 = 'A';      //A
        char c2 = 65;       //A     //as an integer value
        char c3 = '\u0041'; //A     //as an unicode
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        int i1 = 'A';       //65;
        int i2 = '\u0041';  //65
        System.out.println(i1);
        System.out.println(i2);
    }
}
