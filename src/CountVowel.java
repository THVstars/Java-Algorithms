import java.util.stream.IntStream;

public class CountVowel {

    public static void main(String[] args) {

    }

    public static int countTrue(boolean[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                counter++;
            }
        } return counter;
    }
}