import java.util.*;

public class Chapter4 {

    public static void main(String[] args) {

        Scanner pleng = new Scanner(System.in);
        System.out.print("First name : ");
        String fname = pleng.next();

        System.out.print("Last name: ");
        String lname = pleng.next();

        System.out.print("How tall are you ? : ");
        int height = pleng.nextInt();

        int weight = height - 100 ;
        System.out.print("The appropriate weight you have to maintain is : " + weight);


    }

}
