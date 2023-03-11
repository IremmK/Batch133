package day06stringmanipulationsifstatement;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Example 1 : Type code to check if a given string is empty or not
        // "Java" ==> false - "" ==> true
        String s = "Java";

        //1.way: we use length method
        boolean result1 = s.length()==0;
        System.out.println("Is the given string empty?"+ result1);

        //2.way:Recommended because if java has a method for a specific task we always prefer to use it.
        boolean r2 = s.isEmpty();
        System.out.println("Is the given string empty?"+r2);

        //Example 2 : Type code to check if a given string is a containing just " " character or not
        //       ""       "==> true   "a      b" ==> false
        String t = "";

        //1.Way
        boolean r3 = t.replaceAll("[ ]","").length()==0;
        System.out.println("Is it containing jus space character ? " +r3);

        //2.Way:isBlank() checks if the string has any character different from space
        //That is why ısBlank method gives you true for empty string as well
        // "" ==> true    "         " ==> true
        boolean r4 = t.isBlank();
        System.out.println(r4);

        //Example 3 : Type code to join multiple Strings
        //          "Parkland" - "Miami"   - "USA" ==> ParklandMiamiUSA
        String u1 = "Parkland";
        String u2= "Miami";
        String u3 = "USA";

        //1.Way:
        String r1= u1+u2+u3;
        System.out.println(r1);

        //2.Way:
        String rr2 = u1.concat(u2).concat(u3);
        System.out.println(rr2);






    }


    }
