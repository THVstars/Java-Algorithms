public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Racecar"));
    }

    public static boolean isPalindrome(String s) {
        String[] checkPalindrome = s.split("[, :]+");
        String forwards = "";
        String backwards = "";
        String backwardsReversed = "";

        for (int i = 0; i < checkPalindrome.length; i++) {
            forwards += checkPalindrome[i];
            //System.out.println(forwards);
        }
        for (int i = forwards.length() - 1; i >= 0; i--) {
            backwards += forwards.charAt(i);
            //System.out.println(backwards);
        }
        for (int i = backwards.length() - 1; i >= 0; i--) {
            backwardsReversed += backwards.charAt(i);
            //System.out.println(backwardsReversed);
        }

        System.out.println(forwards);
        System.out.println(backwardsReversed);
        return forwards.equalsIgnoreCase(backwardsReversed); // instead of having two .toLowerCase we can have one .equalsIgnoreCase
    }
}
