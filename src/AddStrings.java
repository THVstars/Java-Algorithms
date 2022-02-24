public class AddStrings {
    public static void main(String[] args) {

    }

    public static String add(String a, String b) {
        if (a == "" || a == null || b == "" || b == null) {
            return "Invalid Operation";
        } else {
            int addedStrings = Integer.parseInt(a) + Integer.parseInt(b);
            return String.valueOf(addedStrings);
        }
    }
}
