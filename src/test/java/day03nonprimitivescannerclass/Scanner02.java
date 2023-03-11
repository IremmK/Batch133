package day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Give me a shirt price, please...");
        double shirt= input.nextDouble();

        System.out.println("Give me a shoes price, please...");
        double shoes = input.nextDouble();

        System.out.println("Total price is " + " "+(shirt+shoes));





    }
}
