import java.util.Arrays;

public class SecretSociety {
    public static void main(String[] args) {
        System.out.println(societyName(new String[]{"Taehyung", "Yeontan", "Nyubella", "Carolina" }));
    }

    public static String societyName(String[] friends) {
        Arrays.sort(friends);
        String secret = "";
        for (int i = 0; i < friends.length; i++) {
            secret += friends[i].charAt(0); // first, you need the index of the String -> friends[i], followed by the index of the desired character -> charAt(0).
        } return secret;
    }
}
