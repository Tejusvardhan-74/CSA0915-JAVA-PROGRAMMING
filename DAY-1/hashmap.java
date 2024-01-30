import java.util.*;
class Scratch {
    public static void main(String[] args) {
        Map<Integer,String> numbers = new HashMap<>() ;

        numbers.put(4,"parthu");
        numbers.put(5,"yellamma");
        numbers.put(7,"kopiko");
        numbers.put(6,"mani");
        System.out.println("values added:" + numbers);
        numbers.remove(4);
        System.out.println("values removed after:" + numbers);
    }
}