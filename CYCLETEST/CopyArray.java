import java.util.Arrays;
public class CopyArray {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];
        int index=0;
        for (int element : sourceArray) {
            destinationArray[index++] = element;
        }
        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Copied Array: " + Arrays.toString(destinationArray));
    }
}
