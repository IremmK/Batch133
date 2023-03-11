package day05stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        //EXAMPLE1: Delete all "e"s from a given String
        String s ="Everything is easy if you study";
        s.replace("y","");
        String s1 = s.replace("y","");
        System.out.println(s1); // Everything easy if ou stud

        //Example2: Delete all digits(0,1,2,3,4,5,6,7,8,9)from a given String
        //    To tell Java sth about a group of data we use "regular expressions" (Regex)
        //note: Just a single digits is a data all digits are a group of data

        String  t = "Tom is 13 years old, and his GPA is 3.98";
        String t1= t.replaceFirst("[0-9]","");




        /*
        What is the Regex?
        1) All digits ==> [0-9]
        2)All lower cases ==> [a-z]
        3)All upper cases [A-Z]
        4)All letters==> [a-zA-Z]
        5)All letters and digits==> [a-zA-Z0-9]
        6)All vowels==> [aeiouAEIOU]
        7)All punctuation marks ==>\\p{Punct}
        8)All characters different from digits ==> [^0-9]
        9)All character different from (^) lower cases==> [^a-z]
        10)All caharacter different from [^] letters==> ( ^a-zA-Z)
        11)All character different from (^) vowels ==> [aeiouAEIOU]
         */
        //Example 3: Delete all vowels from a given String
        String u= "Tom are you here?";
        String u1 = u.replaceAll("[aeiouAEIOU]","");
        System.out.println(u1); //Tm, r y hr?

        //Example4: Count how many letters are there in a String
        //Logic: i)Delete all characters different from letters
        //ii)Count the remaining characters

        String m = "Tom, are you here?";
        int numOfLetters = m.replaceAll("[^a-zA-Z]","").length();
        System.out.println(numOfLetters);

        //Count how many digits are there in a String
        String n = "Tom is 13 years old, and his GPA is 3.98";
        int numOfDigits = n.replaceAll("[^0-9]","").length();
        System.out.println(numOfDigits);


        //Example5: Check the users password according to the given rules
        //          1) Passwords should have at least 8 characters.
        //          2) It passwords should not have space character.
        //          3) Password should have at least one upper case
        //          4) At least one lower case
        //          5) Password at least one symbol
        //          6) Password should have at least one digit

        //          1) Passwords should have at least 8 characters.
        String pwd = "As1?fdes3";
        boolean first = pwd.length()>7;
        System.out.println("Is the password containing8 caharacters"+ first);

        //          2) It passwords should not have space character.
        boolean second =  pwd.replaceAll("[^ ]","").length()==0;
        System.out.println("Is the password containing space character" + second);

        //          3) Password should have at least one upper case
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("Is the password containing upper case"+ third);

        //          4) At least one lower case
        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("Is the password containing lower case"+fourth);

        //          5) Password at least one symbol (not letter not digits)
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println("Is the password containing symbol"+fifth);

        //          6) Password should have at least one digit

        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("Is the password containing digit?" + sixth);












    }
}
