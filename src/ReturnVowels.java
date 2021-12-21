public class ReturnVowels {
    public static void main(String[] args) {
        System.out.println(getCount("sound"));
    }
    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y') {
                vowelsCount++;
            } // CHARACTERS NEED SINGLE QUOTES! DOUBLE QUOTES WILL NOT WORK, SINCE IT'LL THINK YOU'RE TRYING TO COMPARE A STRING TO A CHARACTER! Only works on lowercase letters, since that's all we have in the comparison fields. Would be simple to add uppercase letters as well though.
        }
        return vowelsCount;
    }
}