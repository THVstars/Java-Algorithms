public class SwitchAString {
    public static void main(String[] args) {
        System.out.println(flipEndChars("VTH."));
    }

    public static String flipEndChars(String s) {
        String rearranged = "";

        if (s.length() < 2) {
            return "Incompatible.";
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return "Two's a pair.";
        }

        for (int i = 0; i < s.length(); i++) {

            if (i == 0) {
                rearranged += s.charAt(s.length() - 1);
            } else if (i == s.length() -1) {
                rearranged += s.charAt(0);
            } else {
                rearranged += s.charAt(i);
            }
        } return rearranged;
    }
}
