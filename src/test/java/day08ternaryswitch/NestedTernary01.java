package day08ternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {

        //Example1: Type java code by using nested ternary.
        //Write a program to check if a year is leap year or not.
        //If the year is divisible by 100 then it must be divisible by 400.
        //If a year is not divisible by 100 then it must be divisible by 4.
        int year = 1997;
        String r1 = year%100 == 0 ? (year%400==0 ? "Leap": "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");
        System.out.println("Is the year are leap year? "+r1);


        /*
            Type code to check the password
            If it has more than 8 characters, initial should be 'i'
            If it has no more than 8 characters initial should be 'K'
            Solve the task by using nested-ternary
         */

        String pwd = "Kia1b3c";
        String r2 = pwd.length()>8 ? (pwd.startsWith("i") ? "Valid password": "Invalid password"): (pwd.startsWith("K") ? "Valid password": "Invalid password");

        System.out.println(r2);

    }
}
