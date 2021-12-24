public class DoubleLetters {
    public static void main(String[] args) {

    }
    public static boolean doubleLetters(String word) {
        for (int i = 0; i < word.length()-1; i++) { // i < word.length - 1 because we need it to add one below, but it needs to end before the end of the array. So here, it is two below its length (removing 1 for it to be correct for the index, and again for it to add the one in the if statement below).
            if (word.charAt(i) == word.charAt(i+1)) {
                return true;
            }
        }
        return false;
    }
}
