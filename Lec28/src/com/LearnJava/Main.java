package com.LearnJava;

public class Main {

    public static void main(String[] args) {

        String s1 = "NeSo AcaDEMy";

        // toUpperCase method
        System.out.println(s1.toUpperCase());

        // toLowerCase method
        System.out.println(s1.toLowerCase());

        //original text
        System.out.println(s1);

        //length method
        int i = s1.length();
        System.out.println("length: " + i);

        //isEmpty method
        boolean b = s1.isEmpty();
        System.out.println("isEmpty: " + b);

        //isBlank method
        String s2 = "   ";
        boolean b1 = s2.isBlank();
        System.out.println("isBlank: " + b1);

        //charAt method
        char c = s1.charAt(3);     //4th character
        System.out.println("charAt: " + c);


        String s3 = "saghhas";
        //indexOf method
        int i2 = s3.indexOf('a');
        System.out.println("indexOf: " + i2);       //1

        //lastIndexOf method
        int i3 = s3.lastIndexOf('a');
        System.out.println("lastIndexOf: " + i3);       //5

        //concat method
        String s4 = s1.concat(" lessons");
        System.out.println("concat: " + s4);

    }
}
