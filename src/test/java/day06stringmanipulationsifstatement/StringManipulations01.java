package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example 1 : Type code to find the index of the first occurrence of  "a" in a given String
        //      Alabama==>
        String s = "Alabama";
        //indexOf('A') will give you the index of first occurrence of 'a'
        int ıdxA = s.indexOf('a');
        System.out.println(ıdxA);

        //Example 2 : Type code to find the index of the first occurrence of "java" in a given string
        //         "java is easy to learn, java is common the market, java is oop" ==>2
        String t = "java is easy, java is common in the market, java is OOP";
        //indexOf("java") will give you the index of first character of the first occurrence of "java"
        int ıdxJava = t.indexOf("java");
        System.out.println(ıdxJava);
        t.indexOf("Mary");
        // Note: if you use non-existing character or characters in index of method it will give you "-1".
        //note 2 : index of method can be used with char and string data types.
        //Example 3 : Type code to find the index of last occurrence of "m" in a given string.
        //              miami ==>
        String u = "miami";
        //LASTINDEXOFM WILL GIVE YOU THE İNDEX OF THE LAST OCCURRENCE OF'M'
        int idxM= u.lastIndexOf('m');
        System.out.println(idxM);
        //Example 4 : Type code to find the index of the last occurrence of 'earn' in a given string.
        //       Learn java earn money ==>3
        String w = "Learn java earn money";
        int indexEarn =w.lastIndexOf("earn");
        System.out.println(indexEarn);

        // Note: if you use non-existing character or characters in index of method it will give you "-1".
        //note 2 : index of method can be used with char and string data types.

        //Example 5 : Type code to check if a given character is unique or not in a given string.interview question
        //     miami ==> 'a' ==> unique - 'i' ==> not unique
        // If a character is unique in a string indexof and last index of gives the same output.

        String y = "miami";
        char ch = 'a';
        boolean r1 = y.indexOf(ch)== y.lastIndexOf(ch);
        System.out.println("Is the character unique?"+ r1);
        // Note : When you type codes you should be careful about the coding standards
        // 1. coding standard is separate data and the main code







    }
}
