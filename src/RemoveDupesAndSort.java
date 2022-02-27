import java.util.*;

public class RemoveDupesAndSort {
    public static void main(String[] args) {
        //System.out.println(uniqueSort(new int[]{1, 9, 9, 9, 10, 10, 10})); // only prints the object location
        System.out.println(Arrays.toString(uniqueSort(new int[]{1, 9, 9, 9, 10, 10, 10})));
    }

    public static int[] uniqueSort(int[] ugh) {
        return Arrays.stream(ugh).distinct().sorted().toArray();
    }
}