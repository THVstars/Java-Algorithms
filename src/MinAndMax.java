import java.util.Arrays;

public class MinAndMax {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new double[]{1, 200, 300})));
    }

    public static double[] minMax(double[] arr) {
        double[] minMaxArray = {100, -100};
        for (int i = 0; i < arr.length; i++) {
            if (minMaxArray[0] > arr[i]) {
                minMaxArray[0] = arr[i];
            }
            if (minMaxArray[1] < arr[i]) {
                minMaxArray[1] = arr[i];
            }
        } return minMaxArray;
    }
}