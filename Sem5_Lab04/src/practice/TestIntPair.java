package practice;

import java.util.Scanner;

class IntPair {
    private int first;
    private int second;

    public IntPair(int a, int b) {
        first = a;
        second = b;
    }
    public int getFirst() { return first; }
    public int getSecond() { return second; }
}

public class TestIntPair {
    public static void main(String[] args) {

        IntPair range = new IntPair(-5, 20);

        Scanner sc = new Scanner(System.in);

        int input;

        do {
            System.out.printf("Enter a number in (%d to %d): ", range.getFirst(), range.getSecond());
            //System.out.println("Enter a number in ("+range.getFirst()+ " to "+range.getSecond()+"): ");
            input = sc.nextInt();
        } while (input < range.getFirst() || input > range.getSecond());
    }
}