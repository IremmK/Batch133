package day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        /*
        Type a program which calculates the area and the perimeter of a circle
        whose radius is entered by user. ( Use float)
        Hint1) Take pi number as 3.14159
        Hint2) Area of a circle is 3.14159 x radius x radius
        Hint3) Perimeter of a circle is 2 x 3.14159 x radius

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of the circle, please...");
        float piNumber = 3.14159f;
        float radius = input.nextFloat();
        System.out.println("Area: "+ piNumber*radius*radius);

        System.out.println("Perimeter:" +2*piNumber*radius);





    }
}
