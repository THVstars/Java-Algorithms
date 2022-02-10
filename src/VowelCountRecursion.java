public class VowelCountRecursion {
    static int lengthCount = 1; // starts us off at the correct index in the char c variable (length - 1).
    static int vowelCount = 0;
    static String storedString = "";
    public static void main(String[] args) {
        System.out.println(countVowels("KIM Taehyung"));
        System.out.println(countVowels("Carolina"));
        System.out.println(countVowels("Yeontan"));
        System.out.println(countVowels("Nyubella"));
    }

    public static int countVowels(String str) {
        if (!str.equals(storedString)) { // if str doesn't equal storedString
            lengthCount = 1;
            vowelCount = 0;
            storedString = str;
            countVowels(str); // recursive call
        } else if (lengthCount <= str.length()) { // needs to be <= because the 0 index must be included.
            char c = str.charAt(str.length() - lengthCount);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowelCount++;
            }
            lengthCount++; // outside the if statement because they must occur whether the if statement is met or not.
            countVowels(str);
        } return vowelCount;
    }
}
