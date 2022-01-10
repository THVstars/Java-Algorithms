public class PairCoding {
    public static void main(String[] args) {
        System.out.println(makesTen(10, 10));
    }

    public static boolean makesTen(int a, int b) {
        if (a == 10 || b == 10 || a+b == 10) {
            return true;
        } else {
            return false;
        }
    }

    public class Challenge {
        public static int numberSyllables(String word) {
            String[] array = word.split("-", 0);
            return array.length;
        }
    }

    public class Challenge2 {
        public static boolean match(String str1, String str2) {
            if (str1.equalsIgnoreCase(str2)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public class Challenge3 {
        public static String hackerSpeak(String str) {
            String newStr = str.replaceAll("a", "4").replaceAll("e", "3").replaceAll("i", "1").replaceAll("o", "0").replaceAll("s", "5");
            return newStr;
        } // In JavaScript it's str.replace(/a/g, "4") and so on. The g is for global, so that every instance is replaced.
    }
}
