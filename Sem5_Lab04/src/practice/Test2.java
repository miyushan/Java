package practice;

public class Test2 {
    public static void main(String[] args){
        NumericFns<Integer> obj = new NumericFns<Integer>(6);
        NumericFns<Double> obj2 = new NumericFns<Double>(-6.0);

        System.out.println(obj.absEqual(obj2));
    }

}

class NumericFns <T extends Number>{

    T num;
    NumericFns(T ob){
        this.num = ob;
    }

    boolean absEqual(NumericFns<?> ob){
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;
    }

}