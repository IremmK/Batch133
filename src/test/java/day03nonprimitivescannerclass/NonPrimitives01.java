package day03nonprimitivescannerclass;

public class NonPrimitives01 {
    public static void main(String[] args) {

        /*
        What are the differences between primitive and non primitive data types
        1) Non Primitive data is stored in heap memory Primitive data is stored in stack memory
        2)Nonprim dt are infinitely many but prim dt are just 8
        3)Nonprim dt can be created by Java and Java developers but prim dt can be created just by Java.
        4)Non prim dt names start with upper cases and prim dt names use just lower cases

        *5)Non prim dt have i)value and ii)methods in them
        Pirm dt have i)Value

         */
        /*
        1)When you create a string Java will check string pool first if the value you assigned to the string
        exist in the string pool Java will not create a new container Java will use existing container .

        But If the string pool doesn't have the value you assigned Java will  create a new container.

        2)Sometimes we may need a different container even the values are same. How can we do it?

         */


        String stdName = "Tom Hanks";
        String teacherName = "Tom Hanks";
        String parentName = new String("Tom Hanks");
        String principalName = "Bradd Pit";
        System.out.println(parentName);



        int age = 12;
    }
}
