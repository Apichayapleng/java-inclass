package com.company;
import java.util.*;

public class Chap6 {
    public static void main(String[] args){

        Scanner pg = new Scanner(System.in);
        System.out.print("Enter question number : ");
        int Ans = pg.nextInt();

        switch (Ans) {
            case 1:
                gpa();
                break;
            case 2 :
                evenOrOdd();
                break;
            case 3:
                LMUclass();
                break;
            case 4:
                Divisible();
                break;
            case 5:
                transcript();
                break;
        }
    }

    public static void gpa(){
        Scanner pg = new Scanner(System.in);
        System.out.println("Question 1: GPA");
        System.out.print("What is your GPA ? ");
        double student = pg.nextDouble();

        if(student > 3.8 && student <= 4.0){
            System.out.println("Student is on the dean's list. ");
        }
        if(student >= 3.5 && student <= 3.8){
            System.out.println("Student is on the honor roll. ");
        }
    }

    public static void evenOrOdd(){
        Scanner pg = new Scanner(System.in);
        System.out.println("Question 2: Even and Odd number");
        System.out.print("Enter a number: ");
        int num = pg.nextInt();

        if(num%2 == 0){
            System.out.println(num + " is an even number.");
        }
        else {
            System.out.println(num + " is an odd number.");
        }
    }

    public static void LMUclass(){
        Scanner pg = new Scanner(System.in);
        System.out.println("Question 3: Income class");
        System.out.print("Enter: ");
        int num = pg.nextInt();

        if(num < 15000){
            System.out.println("Lower-class");
        }
        if(num >= 15000 && num <= 100000){
            System.out.println("Middle-class");
        }
        if(num > 100000){
            System.out.println("Upper-class");
        }
    }

    public static void Divisible() {
        Scanner pg = new Scanner(System.in);
        System.out.println("Question 4: Divisible by 2, 3, and 5");
        System.out.print("Enter: ");
        int num = pg.nextInt();

        if(num%2 == 0){
            if(num%3 == 0){
                if(num%5 == 0){
                    System.out.println("It can be divisible by 2, 3, and 5.");
                }
            }
        }

    }

    public static void transcript(){
        Scanner pg = new Scanner(System.in);
        System.out.println("Question 5: Transcript");
        double gpa = 0.0, ttgpa = 0, ttsum = 0, ttcredit = 0, sum = 0;

        for(int i=1; i <= 7; i++){
            System.out.print("Enter " + i + " subject code : ");
            String subCode = pg.next();
            System.out.print("Enter " + i + " credit : ");
            int credit = pg.nextInt();
            System.out.print("Enter " + i + " grade : ");
            String grade = pg.next();
            System.out.println();


            if(grade.equals("A") || grade.equals("a")){
                gpa = 4.0;
            }
            else if(grade.equals("B+") || grade.equals("b+")){
                gpa = 3.5;
            }
            else if(grade.equals("B") || grade.equals("b")){
                gpa = 3.0;
            }
            else if(grade.equals("C+") || grade.equals("c+")){
                gpa = 2.5;
            }
            else if(grade.equals("C") || grade.equals("c")){
                gpa = 2.0;
            }
            else if(grade.equals("D") || grade.equals("d")){
                gpa = 1.5;
            }
            else if(grade.equals("F") || grade.equals("f")){
                gpa = 0.0;
            }

            ttcredit = ttcredit + credit;
            sum = gpa * credit;
            ttsum = ttsum + sum;

        }

        ttgpa = ttsum / ttcredit;
        System.out.println("Total GPA is equal to " + ttgpa);

    }
}
