package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ass1();
        ass2();
        ass3();
        ass4();
        ass5(27);
        ass6();
    }

    public static void ass1(){
        int x = 230857;
        System.out.println(x % 10);
    }

    public static void ass2(){
        int y = 658236489;
        System.out.println(y % 10000);
    }

    public static void ass3(){
        int z = 7342;
        System.out.println((z / 10) % 10);
    }

    public static void ass4(){
        int x = 2;
        int y = 3;
        System.out.print("if answer = " + x % 2 + " is odd num");
        System.out.println(" , but if answer = " + y % 2 + " is even num");
    }

    public static void ass5(int x){
        System.out.println("if ans = 1, that mean it divisible by 27. So, the ans is " +  x / 27  );
    }

    public static void ass6(){
        double sum, divide, answer;

        String sj1 = "ICT101";
        String sj2 = "ICT102";
        String sj3 = "ICT103";
        String sj4 = "ICT203";
        String sj5 = "ICT306";
        String sj6 = "ICT489";
        String sj7 = "ICT211";

        int cr1 = 3;
        int cr2 = 3;
        int cr3 = 3;
        int cr4 = 3;
        int cr5 = 3;
        int cr6 = 6;
        int cr7 = 3;

        double g1 = 4;
        double g2 = 3.5;
        double g3 = 3;
        double g4 = 2.5;
        double g5 = 3;
        double g6 = 1;
        double g7 = 1.5;

        sum = (cr1 * g1) + (cr2 * g2) + (cr3 * g3) + (cr4 * g4) + (cr5 * g5) + (cr6 * g6) + (cr7 * g7);
        divide = (cr1+cr2+cr3+cr4+cr5+cr6+cr7);
        answer = sum/divide;

        System.out.println("\n" + sj1 + "\t" + cr1 + "\t" + g1);
        System.out.println(sj2 + "\t" + cr2 + "\t" + g2);
        System.out.println(sj3 + "\t" + cr3 + "\t" + g3);
        System.out.println(sj4 + "\t" + cr4 + "\t" + g4);
        System.out.println(sj5 + "\t" + cr5 + "\t" + g5);
        System.out.println(sj6 + "\t" + cr6 + "\t" + g6);
        System.out.println(sj7 + "\t" + cr7 + "\t" + g7);

        System.out.println("GPA = "+answer);
    }
}
