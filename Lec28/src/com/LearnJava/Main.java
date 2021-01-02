package com.LearnJava;

public class Main {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 2 < 3;     //less than operator
        boolean b4 = 2 > 3;     //greater than operator

        System.out.println(b1); //true
        System.out.println(b2); //false
        System.out.println(b3); //true
        System.out.println(b4); //false

        System.out.println();   //leave space

        boolean isAlive = true;
        if(isAlive)
            System.out.println("alive");    //print alive
        else
            System.out.println("not alive");

    }
}
