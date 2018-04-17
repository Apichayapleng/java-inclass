package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Double gpa = 2.3;
        if (gpa >= 2.5) {
            System.out.println("good on you");
        }
        else {
            System.out.println("wait");
        }

        printNumbers(12);
    }

    public static void printNumbers(int max) {
        System.out.print(1);
        for (int i = 2; i <= max; i++) {
            System.out.print(", " + i); }
        System.out.println(); // to end the line
    }
}
