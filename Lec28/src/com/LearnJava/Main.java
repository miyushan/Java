package com.LearnJava;

public class Main {

    public static void main(String[] args) {
        float f1 = 4.5f;
        //float f2 = 4.5;   can't
        double d1 = 4.5;
        double d2 = 4.5f;   //float converts to double type
        //int i1 = 4.5;     can't
        double d3 = 4;
        System.out.println("f1: " + f1);
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d3: " + d3);
        System.out.println("d2+d3: " + (d2+d3));
    }
}
