public class SearchElement {
    public static void main(String[] args) {
        search(new int[] {1,2,3,4,5}, 3);
    }
    public static int search(int arr[], int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            } // no === strict comparison in java
            } return -1;
}}