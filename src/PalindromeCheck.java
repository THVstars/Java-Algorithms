public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Race_car"));
    }

    public static boolean isPalindrome(String s) {
        String[] checkPalindrome = s.split("[\\W_]+");
        String forwards = "";
        String backwards = "";

        for (int i = 0; i < checkPalindrome.length; i++) {
            forwards += checkPalindrome[i];
        }
        for (int i = forwards.length() - 1; i >= 0; i--) {
            backwards += forwards.charAt(i);
        }

        return forwards.equalsIgnoreCase(backwards); // instead of having two .toLowerCase we can have one .equalsIgnoreCase
    }
}
