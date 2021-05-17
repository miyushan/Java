package practice;

class MyClass<T, V>{

    T ob;
    V ob2;

    MyClass(T ob,V ob2){
        this.ob = ob;
        this.ob2 = ob2;
    }

    void showType(){
        System.out.println(ob.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }
}

public class Test1 {
    public static void main(String[] args){
        MyClass<Integer,Double> obj = new MyClass<>(5,4.6);

        obj.showType();
    }
}


