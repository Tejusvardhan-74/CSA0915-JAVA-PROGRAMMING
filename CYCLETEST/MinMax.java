public class MinMax {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, -10, -20, -30, 0};
        findMinMax(array);
    }

    public static void findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Empty array. No min or max value.");
            return;
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
    }
}