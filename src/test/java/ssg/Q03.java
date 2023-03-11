package ssg;

public class Q03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Yay");
        String add = "<<>>";
        makeOutWord(sb,add);
    }
    public static void makeOutWord (StringBuilder sb , String add){
        sb.insert(0,add.substring(0,2));
        sb.append(add.substring(2,4));
        System.out.println(sb);
    }
}
