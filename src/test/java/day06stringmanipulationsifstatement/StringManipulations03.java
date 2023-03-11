package day06stringmanipulationsifstatement;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Example1: Type code to check if ggiven String Contains a specific character or characters
        //  "New York" ==> w --> true   York--> true  Xxx --> false
        String s = "NewYork";

        boolean r1 = s.contains("Xxx");//true
        System.out.println("Is it containing the given character? "+r1);

        // Example 2: Type code to change the first occurrence of java to python
        // java is java, I like java ---> Python is java, I like java
        String t = "Java is java, I like java";


        String updatedT = t.replaceFirst("java","pyhton");
        System.out.println(updatedT);

        //Example 3: Type code to repeat a given string
        //       Java 4 times ==> JavaJavJavaJava

        String u = "Java";

        //1.Way
        String u1 = u+u+u+u;
        System.out.println(u1);

        //2.Way:
        String u2 = u.concat(u).concat(u).concat(u);
        System.out.println(u2);

        //3.Way:
        String u3 =u.repeat(4);
        System.out.println(u3);



    }
}
