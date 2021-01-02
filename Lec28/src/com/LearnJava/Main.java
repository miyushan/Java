package com.LearnJava;

public class Main {

    public static void main(String[] args) {

        //concatenation
        System.out.println("neso" + "academy");
        System.out.println("neso" + " " + "academy");
        System.out.println("neso " + "academy");
        System.out.println("neso" + 5);
        System.out.println("neso" + 5 + 3);     //won't add 5 and 3 (Because all elements act as strings)
        System.out.println("neso" + (5 + 3));   //add 5 and 3 (5+3=8)

        System.out.println("");
        System.out.println("Neso".concat(" Academy").concat("5"));  //any String can call its methods by a Dot operator
    }
}
