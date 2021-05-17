package practice;

import java.util.*;

public class SortStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int id = 1;
        String temp;
        List<String> names = new ArrayList<>();

        System.out.print("Enter your string here");
        System.out.println("(Press 'o' if you want to end entering) :\t");

        //giving inputs as user input
        do {
            System.out.print("Name " + id + " :\t");
            temp = input.nextLine();

            names.add(temp);
            id++;
        } while (temp != "o");


        //giving inputs manually
        names.add("Shakeer");
        names.add("Nirosha");
        names.add("Arun");
        names.add("Aakila");
        names.add("Miyushan");
        names.add("Rodrigo");

        System.out.println("Unsorted array:");
        print(names);
        System.out.println("\nSorted array:");
        sort(names);
    }

    static void sort(List<String> arr){
        Collections.sort(arr);  //sort by first character of the name
        Collections.sort(arr,Comparator.comparing(String::length));     //sort by length of the name
        print(arr);
    }

    static void print(List<String> arr){
        for (Object name : arr) {
            System.out.println(name);
        }
    }
}
