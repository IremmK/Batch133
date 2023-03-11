package day04stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Example1) Get the first 4 characters from a String and convert them to lower cases
        //          Albania ==> Alba ==> alba
        String s = "GERMany";

        String t = s.substring(0, 4).toUpperCase();
        System.out.println(t);

        //Example2) Check if two String are same or not?
        String r = "Java";
        String u = "java";

        boolean sameEqualSign = r==u;
        System.out.println(sameEqualSign);

        boolean same = r.equals(u);
        System.out.println(same); // false

        boolean sameIgnoreCases = r.equalsIgnoreCase(u);
        System.out.println(sameIgnoreCases);//true

        //Question: Why we do nt use == to compare Strings
        //1.Scenario

        String k = "Java";
        String m = "java";
        boolean f1 = k==m;
        boolean f2 = k.equals(m);
        System.out.println(f1);
        System.out.println(f2);

        //2.Scenario: == and equals() gives you the same output
        String s1 = "Techpro";
        String s2 = "Techpro";
        boolean r1 = s1==s2;
        System.out.println(r1);

        boolean r2 = s1.equals(s2);
        System.out.println(r2);
        //3.Scenario: == and equals() gives you different output

        String t1 = "Phyton";
        String t2 = new String("Phyton");

        boolean d1 = t1 ==t2;
        System.out.println(d1);

        boolean d2 = t1.equals(t2);
        System.out.println(d2);



    }
}
