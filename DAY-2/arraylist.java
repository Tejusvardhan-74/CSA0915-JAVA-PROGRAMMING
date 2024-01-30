import java.util.*;
class arraylist{
    public static void main(String[] args) {
        ArrayList <String> L=new ArrayList<>();
        L.add("abc");
        L.add("def");
        L.add("fgh");
        System.out.println("values added :"+L);
        L.remove("abc");
        L.remove(1);
        System.out.println("values removed after :"+L);

    }
}
