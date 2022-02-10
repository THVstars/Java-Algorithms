import java.util.HashMap;
import java.util.List;

// NOTE: NOT SOLVED. RETURNS YES IF ANY KEY IS FOUND, WHEN IT SHOULD ONLY RETURN YES IF ALL KEYS ARE FOUND.

public class HashMapHarold {
    public static void main(String[] args) {

    }

    public static void checkMagazine(List<String> magazine, List<String> note) {
        HashMap<String, Integer> magazineRepo = new HashMap<>();
        for (String word : magazine) {
            magazineRepo.put(word, 1);
        }

        for (int i = 0; i < note.size(); i++) {
            if (magazineRepo.containsKey(note.get(i)) && note.get(i).equals(note.get(note.size() - 1))) {
                System.out.println("Yes"); // hackerrank did not want return, but print out to the console instead.
            } else if (note.get(i).equals(note.get(note.size()-1))) {
                System.out.println("No");
            }
        }
    }
}
