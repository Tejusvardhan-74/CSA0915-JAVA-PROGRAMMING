import java.util.*;
class Collection {
    public static void main(String[] args) {
        Stack <String> L=new Stack<String>();
        L.add("abc");
        L.add("def");
        L.add("fgh");
        System.out.println("values added :"+L);
        L.remove(1);
        System.out.println("values removed after :"+L);

    }
}