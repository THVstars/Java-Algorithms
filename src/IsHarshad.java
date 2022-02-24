public class IsHarshad {
    public static void main(String[] args) {

    }
    public static boolean isHarshad(int n) {
        String what = String.valueOf(n);
        String[] whatTwo = what.split("");
        int number = 0;
        for (int i = 0; i < whatTwo.length; i++) {
            number += Integer.parseInt(whatTwo[i]);
        } if (n % number != 0) {
            return false;
        } else {
            return true;
        }
    } // converts an integer to a string, then splits that string into a string array. then converts the string array values back to integers to add them up within the number variable, then finally checks if n is divisible by number (the sum of all the digits within itself) and returns either true or false.
}
