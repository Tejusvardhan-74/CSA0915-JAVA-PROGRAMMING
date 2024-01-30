import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 9, 10};
        System.out.println("Original array: " + Arrays.toString(numbers));

        numbers = removeDuplicates(numbers);
        System.out.println("Array after removing duplicates: " + Arrays.toString(numbers));
    }

    public static Integer[] removeDuplicates(Integer[] numbers) {
        HashSet<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(numbers));
        Integer[] result = uniqueNumbers.toArray(new Integer[0]);
        return result;
    }
}