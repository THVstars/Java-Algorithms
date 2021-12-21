public class ExistsHigherNumber {
    public static void main(String[] args) {
        System.out.println(existsHigher(new int[] {1,2,3,4,5}, 6));
    }

    public static boolean existsHigher(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n) {
                return true;
            }
        } return false;
    }
}