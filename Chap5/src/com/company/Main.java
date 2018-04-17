package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

//        sum();
//        DrawSqaure();
        DrawDiamond();

    }

    public static int sum() {
        Scanner pg = new Scanner(System.in);

        int hrttl = 0;
        for (int i=1 ; i <= 4 ; i++) {
            System.out.print("Employee " + i +": How many days? ");
            int emp = pg.nextInt();
            for (int n=1; n<=emp ; n++) {
                System.out.print("Hours? ");
                int hr = pg.nextInt();
                hrttl = hrttl + hr;
            }
            System.out.println("Total: " + hrttl);
            hrttl = 0;
        }
        return 0;
    }

    public static int DrawSqaure(){
        for (int i=1 ; i<=2 ; i++) {
            System.out.println("====+====");
            for (int n=1 ; n<=3 ; n++){
                System.out.println("#   |   #");
            }
        }
        System.out.println("====+====");
        return 0;
    }

    public static int DrawDiamond(){
        System.out.println("#================#");

        upperDiamond();
        lowerDiamond();

        System.out.println("#================#");
        return 0;
    }

    public static void upperDiamond() {
        for(int i=4 ; i > 0 ; i-- ) {
            // print conner left
            System.out.print("|");
            // space left
            for(int j=i*2-2 ; j > 0 ; j-- ) {
                System.out.print(" ");
            }

            System.out.print("<>");

            // dot left
            for (int j = 0; j < 4-i; j++) {
                System.out.print("..");
            }

            // =============================
            // dot right
            for (int j = 0; j < 4-i; j++) {
                System.out.print("..");
            }

            System.out.print("<>");

            // space right
            for(int j=i*2-2 ; j > 0 ; j-- ) {
                System.out.print(" ");
            }

            //print conner right
            System.out.print("|");
            System.out.println();
        }
    }

    public static void lowerDiamond() {
        for(int i=0 ; i < 4 ; i++ ) {
            // print conner left
            System.out.print("|");
            // space left
            for(int j=0; j < i*2 ; j++ ){
                System.out.print(" ");
            }
            System.out.print("<>");

            // dot left
            for (int j = 3; j > i; j--) {
                System.out.print("..");
            }

            // =============================

            // dot right
            for (int j = 0; j < 3-i; j++) {
                System.out.print("..");
            }

            System.out.print("<>");

            // space right
            for(int j=i*2 ; j > 0 ; j-- ) {
                System.out.print(" ");
            }

            // print conner right
            System.out.print("|");
            System.out.println();
        }
    }

}