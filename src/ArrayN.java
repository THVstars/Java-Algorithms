public class ArrayN {
    public static void main(String[] args) {

    }

    public static int[][] squarePatch(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = n;
            }
        } return array; // returns an array of with n indexes (both down and side) and with number n at every index.
    }
}
