import java.util.Arrays;

public class HalfSplit {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberSplit(11)));
    }

    public static int[] numberSplit(int n) {
        int[] intArray = new int[]{(int) (Math.floor(n / 2.0)), (int) (Math.ceil(n / 2.0))};
        return intArray;
    }
}
