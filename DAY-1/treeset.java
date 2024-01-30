import java.util.*;
class treeset {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet <>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("values added:" + numbers);
        numbers.remove(3);
        System.out.println("values removed after:" + numbers);
    }
}