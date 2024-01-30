import java.util.Scanner;
public class SpecifyElement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to Specify: ");
        int elementToFind = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == elementToFind) {
                found = true;
                System.out.println("Element Specified at index " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Element unable to specify in the array");
        }

        scanner.close();
    }
}
