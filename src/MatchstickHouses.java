public class MatchstickHouses {
    public static void main(String[] args) {
        System.out.println(matchHouses(10));
    }

    public static int matchHouses(int step) {
        int matches = step*6 - (step-1)*1;
        return matches;
    }
}