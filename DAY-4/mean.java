public class mean
{
    public void main(String[] args) {
        int a[] = {66, 79, 84, 53, 28, 17, 91, 35};
        double sum = 0;
        double average;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        average = sum / (a.length);
        System.out.println(average);

    }
}

