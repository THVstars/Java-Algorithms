import java.util.HashMap;
import java.util.List;

public class HashMapSubstringShared {
    public static void main(String[] args) {
        System.out.println(twoStrings("Taehyung", "Carolina"));
    }

    public static String twoStrings(String s1, String s2) {
        // Checks if the two strings share any letters.
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            if (map.containsKey(s2.charAt(i))) {
                return "YES";
            }
        } return "NO";
    }
}
