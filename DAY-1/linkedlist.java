import java.util.*;
class linkedlist {
    public static void main(String[] args) {
        LinkedList <String> L=new LinkedList<String>();
        L.add("abc");
        L.add("def");
        L.add("fgh");
        System.out.println("values added :"+L);
        L.remove(1);
        System.out.println("values removed after :"+L);

    }
}