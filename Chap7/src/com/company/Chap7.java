package com.company;
import java.util.*;

public class Chap7 {
    public static void main(String[] args){

        Scanner pg = new Scanner(System.in);
        System.out.print("Enter question number : ");
        int Ans = pg.nextInt();

        switch (Ans) {
            case 1:
                roll();
                break;
            case 2:
                check();
                break;
        }
    }

    public static void roll(){
        int count = 0;
        while(true){
            Random rand = new Random();
            int i = rand.nextInt(7) +1;
            int j = rand.nextInt(7) +1;
            int ans = i + j;
            System.out.println("Roll: "+i+" + "+j+" = "+ ans);
            count++;
            if(ans == 7){
                System.out.println("You won after "+ count +" tries!");
                break;
            }
        }
    }

    public static void check(){
        int count = 0;
        while(true){
            Random rand = new Random();
            int i = rand.nextInt(20) +1;
            int j = rand.nextInt(20) +1;
            int mul = i*j;
            System.out.print(i + " * " + j + " = ");
            Scanner pg = new Scanner(System.in);
            int ans = pg.nextInt();
            if(ans == (i*j)){
                System.out.println("Correct!");
                count++;
            }
            else if (ans != (i*j)) {
                System.out.println("Incorrect!; the correct answer was " + mul);
                System.out.print("You solved "+ count + " correctly.");
                break;
            }
        }
    }
}