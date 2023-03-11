package day07ifstatementternarystatement;

public class IfStatement01 {

    public static void main(String[] args) {


        //Example 1 : Type code to check if a given character is uppercase or lower case or others
        //Note1:To get true from end operation everything should be true
        //Note 2 : Just a single false is enough to make the result false
        //Note 3 : And operation is perfectionist.

        char ch = 'S';
        if(ch>='A' && ch<='Z'){
            System.out.println("Upper case");

        }else if(ch>='a' && ch<='z'){
            System.out.println("Lower case");
        }else{
            System.out.println("Others...");
        }

        //Example 2 : If a number is less than 300 or greater than 3000
        // print "perfect number" on the console otherwise
        //print " regular number" on the console.
        //|| means or
        //Note 1 : To get false from or operation everything should be false without having all is false you can not get result
        //Note2: To make the result of || operation having just a single true is enough.
        //Note3: || operation is optimist
        int num= 1200;
        if(num<300 || num>3000){
            System.out.println("Perfect Number");

        }else{
            System.out.println("Regular Number");
        }
        //Example 3 : Type code to check if a number is "even" or "odd"
        int n = 8;
        if(n%2==0 ){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        //Example4 : Typce code to print the number of months for the given month name
        //  if ı give you february your code will give me 12
        //if ı give you tom your code will give me inInvalid month name
        String monthsName = "March";
        if(monthsName.equals("January")){
            System.out.println(1);
        }else if(monthsName.equals("February")){
            System.out.println(2);
        }else if(monthsName.equals("March")) {
            System.out.println(3);
        }else if(monthsName.equals("April")){
            System.out.println(4);
        }else if(monthsName.equals("May")) {
            System.out.println(5);
        }else if(monthsName.equals("June")){
            System.out.println(6);
        }else if(monthsName.equals("July")) {
            System.out.println(7);
        }else if(monthsName.equals("August")){
            System.out.println(8);
        }else if(monthsName.equals("September")) {
            System.out.println(9);
        }else if(monthsName.equals("October")){
            System.out.println(10);
        }else if(monthsName.equals("November")) {
            System.out.println(11);
        }else if(monthsName.equals("December")){
            System.out.println(12);
        }else{
            System.out.println("Invalid month name");
        }















    }}
