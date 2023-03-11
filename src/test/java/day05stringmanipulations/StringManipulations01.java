package day05stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example 1: Type code to check if the seventh character of a given String is "a" or "not"
        String s= "Alabama state";
        //1.WWay:
        boolean result1= s.charAt(6)=='a';
        System.out.println("Is the seventh character a?"+ result1); // true

        //2.Way:
        boolean result2 = s.startsWith("a",6);
        System.out.println(result2);

        //There are 1 task for Java
        //true

        //Example 2 : Type code to check if a string is ending with money or not
        String t = "Learn Java earn money";
        //1.way:substring()
        t.substring(t.length()-5).equals("m");
        boolean result3 = t.substring(t.length()-5).equals("money");
        System.out.println("Is the String ending with 'money'?"+ result3);
        //2.Way:
        boolean result4 = t.endsWith("money");
        System.out.println("Is the String ending with 'money'?"+ result4);

        //Example 3: Type code to convert "money" or not
        char target;
        String newT= t.replace("money", "dollar");
        System.out.println(newT); //Learn Java earn dollar

        //WHEN YOU USE REPLACE() METHODS CREATE A CONTAINER TO STORE UPDATE IT DATA İN IT.

        //example4: Type codes to convert a to "*"?
        String t2 =t.replace("a","*");
        System.out.println(t2); //L*ern J*V* e*rn money
        String t3 = t.replace("earn","win");
        System.out.println(t3); // Learn Java win dollar
        //When you use replace method all a's are converted to *
        //Replace methods can be used with char and strings in replace methods perentezis but both could be char or both
        //must be string you can not make one char one string



    }
}
