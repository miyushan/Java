package practice;
//package lab04_q2;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author 2017e009
 */
public class learn {

    public static void SwappedKeyAndValues(Map<String, String> map){
        Map<String, String> newMap = new HashMap<String, String>();
        for(Map.Entry<String, String> e: map.entrySet()){
            String Key = e.getKey();
            String Value = e.getValue();
            newMap.put(Value, Key);
        }
    }

    public static void main(String[] args) {

        try {
            Map<String, String> oldMap = new HashMap<String, String>();
            oldMap.put("String1.1", "String1.2");
            oldMap.put("String2.1", "String2.2");
            System.out.println("Old Map: " + oldMap);

            SwappedKeyAndValues(oldMap);
        }
        catch (Exception e){

            System.out.print("NullPointerException is neglected.\n");
        }
        finally {
            System.out.print("The 'try catch' is successfully implemented.");
        }
    }

}
