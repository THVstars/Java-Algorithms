public class HittingTheJackpot {
    public static boolean testJackpot(String[] result) {
        for (int i = 0; i < result.length - 1; i++) {
            if (result[i]!=result[i+1]) {
                return false;
            }
        } return true;
    }
}
