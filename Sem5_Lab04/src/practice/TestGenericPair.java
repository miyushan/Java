package practice;

import org.w3c.dom.ls.LSOutput;

public class TestGenericPair {
    public static void main(String[] args){

        Pair<Integer> obj = new Pair<Integer>(-5,20);
        Pair<String> obj2 = new Pair<String>("Shakeer","Miyushan");

        System.out.println(obj.getFirst()+"\t"+obj.getSecond());
        System.out.println(obj2.getFirst()+"\t"+obj2.getSecond());
    }

}

class Pair<T>{
    private T first;
    private T second;

    Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
