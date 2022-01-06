public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Will this really work, Taehyung?"));
    }

    public static String reverse(final String str) {
        String reversed = "";
        // System.out.println(str.length());
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // CONVERTS CHAR TO STRING ONLY IF YOU USE +=. USING = ONLY WILL CAUSE A TYPE ERROR, SINCE THE VARIABLE REVERSED IS A STRING.
        } return reversed;
    }
}