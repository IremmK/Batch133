package day08ternaryswitch;

import java.util.Scanner;

public class Switch03 { public static void main(String[] args) {

    //Create a simple calculator which does addition, subtraction, multiplication, division, percentage calculation
    //Note1: Inside the switch parenthesis you can use 1)int 2)byte 3)short 4)char 5)String
    //Note3: Inside the switch parenthesis you can not the use 1)long 2)float 3)double 4)boolean
    Scanner input= new Scanner(System.in);
    System.out.println("Enter first number");
    double num1 = input.nextDouble();
    System.out.println("Enter second number");
    double num2 = input.nextDouble();
    System.out.println("Enter operation symbol : +,-,*,/,%");
    char operation = input.next().charAt(0);

    switch(operation){
        case '+':
            System.out.println("The sum is"+(num1+num2));
            break;
        case '-':
            System.out.println("The num is "+(num1-num2));
            break;
        case'*':
            System.out.println("The num is "+(num1*num2));
            break;
        case '/':
            System.out.println("The num is "+(num1/num2));
            break;
        case'%':
            System.out.println("The num is "+(num1*num2)/100);
            break;
        default:
            System.out.println("This operation was not defined in this calculator");

    }




}

}
