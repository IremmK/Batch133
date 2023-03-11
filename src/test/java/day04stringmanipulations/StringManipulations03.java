package day04stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {

        //Example1) Check the password if it has given rules
        //        1)It should start with upper case j
        //         2)ıt should have at least 8 characters
        //         3)Last three characters should be "AVA"
        String pwd = "J12!?AVA";
        //ıT SHOULD START WİTH J
        boolean firstRule = pwd.startsWith("J");
        System.out.println("First rule:" + firstRule);

        //         2)ıt should have at least 8 characters
        //Note: There are "comparison operators" in Java: "==","<" , ">" , "<=",">=", "!=",
        //When you use comparison operators, you will get boolean everytime

        boolean secondRule = pwd.length()>7;
        System.out.println("Second rule:" + secondRule);

        //3)Last three characters should be "AVA"
        //Note: If you want to get characters from and index to the last characters.
        //Use substring methods just with starting index.

        boolean thirdRule = pwd.substring(5, 8).equals("AVA");
        System.out.println("Third rule:" + thirdRule);

        /*
        What did we learn today:
        1)charAt() ==> char data type
        2)toUpperCase() ==> String
        3)toLowerCase() ==> String
        4)trim() ==> String
        5)split() ==> We will learn it later
        6)length() ==> int data type
        7)substring(Beginning Index, Ending Index) ==> String
        8)substring(Beginning Index) ==> String
        9)equals() ==> boolean data type
        10)equalsIgnoreCase() ==> boolean
        11)startsWith() ==> boolean

        Note: When you learn methods in Java you should learn
                   i) What does the method do?
                   ii)What are the different usages?
                   iii)What does the method give you?
         */




    }
}
