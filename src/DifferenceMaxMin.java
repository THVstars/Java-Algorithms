import java.util.Arrays;

public class DifferenceMaxMin {
    public static void main(String[] args) {
        System.out.println(differenceMaxMin(new int[] {1,2,3,4,5}));
    }
    public static int differenceMaxMin(int[] arr) {
        Arrays.sort(arr); // automatically assigns the value to the array, so no need to assign it
        return arr[arr.length-1] - arr[0];
    } // in a for-loop, when you use i < arr.length, the max length it actually ever reaches is arr.length-1! Because it's always less than.
}