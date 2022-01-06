public class MatchstickHouses {
    public static void main(String[] args) {
        System.out.println(matchHouses(10));
    }

    public static int matchHouses(int step) {
        int matches = 0;
        if (step > 0) {
            matches = step*6 - (step - 1); // can also do step*5 + 1
        } return matches;
    }
}