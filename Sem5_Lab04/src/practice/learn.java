package practice;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author 2017e009
 */
public class learn {

    public static Map<String, String> swap(Map<String, String> map){
        Map<String, String> tempMap = new HashMap<>();
        List<String> values = new ArrayList<>();

        map.forEach((k, v) -> { // used to traverse through the map
            values.add(v);
            if(k.equals(v)){ // check for the duplication
                try {
                    // throwing the exception
                    throw new Exception("Key and Value duplication");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else{
                // if no duplication then add swapped keys and values to the new map
                tempMap.put(v, k);
            }
        });
        return tempMap;
    }

    public static void main(String[] args) {

        // map1 without any duplication
        // map2 with duplications
        Map<String, String> map2 = new HashMap<>();
        map2.put("f1" , "mango");
        map2.put("f2" , "banana");
        map2.put("carrot" , "carrot");
        map2.put("v2" , "beat");
        map2.put("s1" , "sugar");
        map2.put("s2" , "chili");

        map2 = swap(map2);// Exception wil gets called here
        print_map(map2);// duplicated key value pair will not gets added to the new map
    }

    static void print_map(Map<String,String> names){
        for (Map.Entry pairEntry: names.entrySet()){
            System.out.println(pairEntry.getKey()+" : "+pairEntry.getValue());
        }
    }

}
