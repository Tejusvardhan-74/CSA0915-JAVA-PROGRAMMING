import java.util.HashMap;
import java.util.Map;
public class Mode{
    public static void main(String[] args) {
        int[] array = {2,8,6,8,6,7,1};
        int mode = findMode(array);
        System.out.println("Mode of the array: " + mode);
    }
    static int findMode(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int mode = 0;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }
}
