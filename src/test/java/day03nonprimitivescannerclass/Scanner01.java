package day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //To get data from user in Java we use "Scanner Class"
        //Steps to get data from user

        //1)Create a Scanner Class Object
        //class name            Objet name  assignment operator     new                      Constructor
        Scanner input           =                 new                    Scanner(System.in);

        //2)Give a message to user
        System.out.println("Enter your age...");

        //3)Get the data by from user by using "input" object
        byte age = input.nextByte();

        System.out.println("Your age is"+age);

    }
}
