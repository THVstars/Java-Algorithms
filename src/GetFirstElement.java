public class GetFirstElement {
    public static void main(String[] args) {
        System.out.println(getFirstValue(new int[] {1,2,3,4,5})); // TEST
    } // void because it's the main method, where we want to return the values of other methods. in this case, it'll return the value of the getFirstValue method only.

    public static int getFirstValue(int[] arr) {
        return arr[0];
    } // arrays: type[] variableName
}