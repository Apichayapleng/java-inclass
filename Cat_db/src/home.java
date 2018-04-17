//package com.company;
import  java.sql.Connection;
import java.sql.DriverManager;

public class home {

    public static void main(String[] args) {
        // write your code here
//        Connection connection = null;
        try {
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://loccalhost:8888/localhost/MyDB","root","");
            System.out.println("Connection Success");

        }catch (Exception e) {
            System.err.println(e);

        }
    }
}
