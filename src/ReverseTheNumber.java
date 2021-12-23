public class ReverseTheNumber {
    public static void main(String[] args) {
        System.out.println(rev(34898498));
    } // edge cases: accounting for a requirement that's not normal, the unique specifications of your algorithm.
    public static String rev(int n) {
        String nString = Integer.toString(n);
        String result = "";
        for (int i = nString.length()-1; i >= 0; i--){
            result += String.valueOf(nString.charAt(i));
        } // converts a character to a string value.

        if (n < 0) {
            return result.substring(0, result.length()-1);
        } // like slice/splice but for strings? this will remove the - in front of negative numbers, since the requirement asked they be treated as positive numbers.
        return result;
    }
}