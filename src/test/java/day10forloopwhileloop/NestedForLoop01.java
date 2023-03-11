package day10forloopwhileloop;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {
        /*
        Example2 : Ype code to get output like
        Week:1
        Day:2
        Day:3
        ......
        Week:2
        Day:1
        Day:2
        Day:3
        ......
        Week:3
        Day:1
        Day:2
        Day:3
        ......
         */
        for (int i = 1; i < 5; i++) {
            System.out.println("Week: " + i);
            for (int k = 1; k < 8; k++) {
                System.out.println("Day: " + k);
            }
        }

        /*
        Note 1 : Nested loops are time-consuming (it means spends time too much to complete to task) that is why
        if it is not mandatory do not prefer to use nested loops If a code is time-consuming
        it means it has time complexity.There is a way to calculate the value of time complexity
        If you have two loops then time complexity is the square of two it means for
         */
        /* Example 3 : Write a Java Program to print Rectangle Star Pattern using for loop
        ***
        ***
        ***
        Note: Get the number of rows and columns from user
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns");
        int columns = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= columns; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
