package com.company;
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner pg = new Scanner(System.in);

        System.out.print("Name : ");
        String name1 = pg.next();
        double totalBMI1 = bmi(pg);
        System.out.println( name1 + " body mass index = " + totalBMI1);

        System.out.print("Name : ");
        String name2 = pg.next();
        double totalBMI2 = bmi(pg);
        System.out.println( name2 + " body mass index = " + totalBMI2);

        double diff = totalBMI1 - totalBMI2;
        System.out.print("\n Difference = " + diff );

    }

    public static double bmi(Scanner pg){

        System.out.print("Height (in inches) ? : ");
        double height = pg.nextDouble();
        System.out.print("Weight (in pounds) ? : ");
        double weight = pg.nextDouble();
        return weight / (height * height) * 703;
    }
}
