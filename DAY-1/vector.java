import java.util.*;
class Collection {
    public static void main(String[] args) {
        Vector <String> L=new Vector<>();
        L.add("abc");
        L.add("def");
        L.add("fgh");
        System.out.println("values added :"+L);
        L.remove("def");
        L.remove(0);
        System.out.println("values removed after :"+L);

    }
}