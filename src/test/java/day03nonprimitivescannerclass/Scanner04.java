package day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        /*
        Type a program with calculates the volume of a rectangular prism
        whose length, width, and height are entered by user.
        Hint1: Volume of a rectangular prism is width x length x height
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter width, length and height of the rectangle prism, please...");
        double width = input.nextDouble();
        double length = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("Volume: " + width*length*height);




    }
}
