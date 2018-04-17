package com.company;
        import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner pg = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = pg.nextInt();
        digitSum(i);
    }

    public static int digitSum(int i) {
        int count = 0;
        while(i > 0) {

            count += i%10;
            i = i / 10;
            System.out.println(count + " ");
        }
        return i;
    }
}
