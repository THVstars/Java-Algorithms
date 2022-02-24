import java.util.ArrayList;

public class MultiplesArray {
    public static void main(String[] args) {

    }

    public static int[] arrayOfMultiples(int num, int length) {
        int counter = 0;
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            counter++;
            arr[i] = num*counter;
        } return arr; // instead of using a counter, can also do num * i+1
    }
}