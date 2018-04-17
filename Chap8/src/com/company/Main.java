package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] numbers = new int[8];
//        numbers[1] = 4;
//        numbers[4] = 99;
//        numbers[7] = 2;
//        int x = numbers[1];
//        numbers[x] = 44;
//        numbers[numbers[7]] = 11;
//        for (int i = 0; i < 8; i++) {
//            System.out.print(numbers[i] + " "); }
//        System.out.println();   // end the line of output

        Scanner pg = new Scanner(System.in);
        System.out.print("Enter question number : ");
        int Ans = pg.nextInt();

        switch (Ans) {
            case 1:
                System.out.print("How many days' temperature? : ");
                int round = pg.nextInt();
                weather(round);
                break;
            case 2:
                tenInteger();
                break;
            case 3:
                evenNum();
                break;
            case 4:
                random();
                break;
            case 5:
                System.out.print("How many input string : ");
                int num = pg.nextInt();
                numString(num);
                break;
            case 6:
                System.out.print("How many student : ");
                int student = pg.nextInt();
                studentID(student);
                break;
        }
    }

    public static void weather(int round){
        Scanner pg = new Scanner(System.in);
        int sum =0;
        int [] temp = new int[round];
        for(int i=0; i<round ;i++){
            System.out.print("Day " + (i+1) + "'s high temp: " );
            temp[i] = pg.nextInt();
            sum += temp[i];
        }
        double avgTemp = sum/round;
        System.out.println("Average temp = " + avgTemp);
        int count = 0;
        for(int j=0 ; j<round ;j++){
            if(avgTemp < temp[j]){
                count++;
            }
        }
        System.out.println(count + " days were above average.");
    }

    public static void tenInteger(){
        Scanner pg = new Scanner(System.in);
        int [] num = new int[10];
        for(int i=0 ; i<10 ; i++){
            System.out.print("Enter positive integer: " );
            num[i] = pg.nextInt();
        }
        for(int j= 9 ; j>=0 ; j--){
            System.out.print( num[j] + " ");
        }
    }

    public static void evenNum(){
        Scanner pg = new Scanner(System.in);
        int [] num = new int[10];
        for(int i=0 ; i<10 ; i++){
            System.out.print("Enter positive integer: " );
            num[i] = pg.nextInt();
        }
        for(int j= 0 ; j<10 ; j++){
            if(num[j]%2 == 0) {
                System.out.print(num[j] + " ");
            }
        }
    }

    public static void random(){
        int max=0 , min=0, avg=0, sum=0;
        Random rand = new Random();
        int[] num = new int[100];
        for(int i=0 ; i<100 ; i++) {
            num[i] = rand.nextInt(99) + 1;
            sum += num[i];
        }
        for(int j= 0 ; j<10 ; j++){
            if(num[j]>max) {
                max = num[j];
            }
            if(num[j]<min){
                min = num[j];
            }
        }
        System.out.println("max = " + max + " ");
        System.out.println("min = " + min + " ");
        avg = sum/100;
        System.out.println("avg = " + avg + " ");
    }

    public static void numString(int n){
        int max=0;
        Scanner pg = new Scanner(System.in);
        String[] num = new String[10];
        for(int i=0 ; i<n ; i++){
            System.out.print("Enter string: " );
            num[i] = pg.next();
            if(num[i].length()>max) {
                max = num[i].length();
            }
        }
        System.out.println("max string = " + max + " ");
    }

    public static void studentID(int student){
        Scanner pg = new Scanner(System.in);
        int[] arrID = new int[10];
        int[] arrMark = new int[10];
        for(int i=0 ; i<student ; i++){
            System.out.print("Enter student id: " );
            arrID[i] = pg.nextInt();
            System.out.print("Enter student mark: " );
            arrMark[i] = pg.nextInt();
        }
        System.out.println("Student id \t\t Mark");
        for(int j=0 ; j<student ; j++){
            System.out.println("\t"+ arrID[j]+"\t\t\t"+arrMark[j]);
        }
    }
}