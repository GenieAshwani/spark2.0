package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestException {
    public static void main(String[] args) {
        System.out.println("before try");
       try
       {
           System.out.println("before risky code");
           System.out.println(10/0);  //risky Code
           System.out.println("after risky cod");
       }
       catch (Exception e)
       {
           System.out.println("In catch block");
           e.printStackTrace();
           System.out.println(e.toString());
           System.out.println(e.getMessage());

       }
        System.out.println("ashwani");
        System.out.println("ashwani");
        System.out.println("ashwani");
    }
}
