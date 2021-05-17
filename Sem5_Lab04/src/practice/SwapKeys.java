package practice;

import java.util.HashMap;
import java.util.Map;


/**
 * Author:  2018/E/102
 * This programme is used to swap keys and values in a map function
 */
public class SwapKeys {
    public static void main(String[] args) {

        Map<String,String> names = new HashMap<>();
        names.put("shakeer","miyushan");
        names.put("nadeesha","madhuranga");
        names.put("dineth","damsara");
        names.put("isuru","isuru");

        System.out.println("\tBefore swap:");
        print(names);

        swap(names);
    }


    static void print(Map<String,String> names){
        for (Map.Entry pairEntry: names.entrySet()){
            System.out.println(pairEntry.getKey()+" : "+pairEntry.getValue());
        }
    }


    static void swap(Map<String,String> names){
        Map<String,String> newMap = new HashMap<>();       //new Map function

        System.out.println("\n\tAfter swap:");
        for(Map.Entry<String,String> e: names.entrySet()){

            if(!e.getKey().equals(e.getValue())){   //check weather any key match to its value
                //swap key and value properties
                String Key = e.getKey();
                String Value = e.getValue();
                newMap.put(Value, Key);
            }
            else{
                System.out.println("Enter valid inputs!!!");
                break;
            }

        }

        print(newMap);
    }

}
