package day07ifstatementternarystatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example1 : Get users age for
        //0-4 ==> baby   5-12 ==> kid   13-19==> teenager  20-30 ==> adult
        //Others ==> Undefined       -    negative ages ==> Invalid age
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age...");
        byte age = input.nextByte();
        if(age<0){
            System.out.println("Invalid age");
        }else if(age<5){
            System.out.println("Baby");
        }else if(age<13){
            System.out.println("Kid");
        }else if(age<20){
            System.out.println("Teenager");
        }else if(age<31){
            System.out.println("Adult");
        }else{
            System.out.println("Undefined");
        }




    }
}
