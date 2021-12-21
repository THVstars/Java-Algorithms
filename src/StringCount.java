public class StringCount {
    public static void main(String[] args) {
        System.out.println(countWords("Kim Taehyung is my motivation."));
    }
    public static int countWords(String s) {
        return s.split(" ").length;
    } // Splits on each space and then counts the length.
}

