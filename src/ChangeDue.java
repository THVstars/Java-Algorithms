import java.util.Arrays;
import java.util.stream.IntStream;

public class ChangeDue {
    public static void main(String[] args) {
        System.out.println(changeEnough(new int[]{6, 7, 9, 10}, 9.10));
    }
    public static boolean changeEnough(int[] change, double amountDue) {
        if ((change[0]*.25 + change[1]*.10 + change[2]*.05 + change[3]*.01) >= amountDue) {
            return true;
        } else {
            return false;
        }
    }
}
