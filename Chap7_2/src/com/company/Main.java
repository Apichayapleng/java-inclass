package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner pg = new Scanner(System.in);
        System.out.print("Enter question number : ");
        int Ans = pg.nextInt();

        switch (Ans) {
            case 1:
//                Scanner pg = new Scanner(System.in);
                System.out.print("Enter(a,e,i,o,u): ");
                String name = pg.next();
                isVowel(name);
                break;
            case 2:
                System.out.print("Enter: ");
                int num = pg.nextInt();
                allDigitsOdd(num);
                break;
            case 3:
                System.out.print("Enter: ");
                String input = pg.next();
//                countVowels(input);
                int count = countVowels(input);
                System.out.println(count);
                break;
            case 4:
                System.out.print("Type a number: ");
                int primeNum = pg.nextInt();
                primeNum(primeNum);
                break;
            case 5:
                System.out.print("Enter: ");
                int radius = pg.nextInt();
                area(radius);
                break;
            case 6:
                System.out.print("Enter: ");
                int x1 = pg.nextInt();
                int x2 = pg.nextInt();
                int y1 = pg.nextInt();
                int y2 = pg.nextInt();
                distanceFromOrigin(x1,x2,y1,y2);
                break;
            case 7:
                System.out.print("Enter: ");
                int attend = pg.nextInt();
                attendance(attend);
                break;
        }

    }

    public static void isVowel(String name){
        if(name.equals('a') || name.equals('e') || name.equals('i') || name.equals('o') || name.equals('u')){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public static void allDigitsOdd(int num){
        int count = (int) Math.log10(num) + 1;
        int m = 0;
        for(int i=1 ; i<= count ; i++){
            m = num%10;
            num = num/10;

            if(num%2 != 0){
                System.out.println("true");
                break;
            }
            else{
                System.out.println("false");
                break;
            }
        }
    }

    public static int countVowels(String input){
        int count = 0;
        for(int i=0 ; i< input.length(); i++) {
            char n = input.charAt(i);
            if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void primeNum(int primeNum){
        boolean isPrime = true;
        int m;
        for(int i=2 ; i <= primeNum/2 ; i++)
        {
            m = primeNum % i;
            if(m == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(primeNum + " is a Prime Number");
        else
            System.out.println(primeNum + " is not a Prime; the next prime after " + primeNum + "is ");
    }

    public static void area(int radius){
        double pi = 3.14;
        double ans = pi * Math.pow(radius, 2);
        System.out.println("the area is equal to " + ans);
    }

    public static void distanceFromOrigin(int x1,int x2,int y1,int y2){
        double x = Math.pow(x2-x1, 2);
        double y = Math.pow(y2-y1, 2);
        double d = Math.sqrt(x+y);
        System.out.println("Answer is equal to " + d);
    }

    public static void attendance(int attend){
        if(attend <= 10){
            if(attend <= 5){
                int finalANS = attend*1;
                System.out.println(finalANS);
            }
            else if(attend > 5){
                int ans = attend - 5;
                int ans2 = attend - ans;
                int finalANS = (ans*1) + (ans2*2);
                System.out.println(finalANS);
            }
        }
        else {
            System.out.println("incorrect input");
        }
    }
}