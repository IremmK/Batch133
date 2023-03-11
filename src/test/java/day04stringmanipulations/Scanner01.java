package day04stringmanipulations;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //Example1: Get the initials of a name which contains first name and last name
        //        Tom Hanks ==> TH
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and last name...");
        String fullName = input.nextLine();

        char first = fullName.charAt(0);
        char last = fullName.split(" ")[1].charAt(0);
        System.out.println(first+" - "+ last);


        System.out.println("Enter your favourite football team");
        String footballTeam= input.nextLine();
        char r1= footballTeam.charAt(0);
        char r2= footballTeam.split(" ")[1].charAt(0);
        System.out.println(r1+"-"+r2);








    }
}
