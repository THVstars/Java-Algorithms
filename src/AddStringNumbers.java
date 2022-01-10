public class AddStringNumbers {
    public static void main(String[] args) {
        System.out.println(addNums("1, 2, 3, 4"));
    }

    public static int addNums(String nums) {
        String[] numsArray = nums.split(", ", 0);
        int total = 0;
        for (int i = 0; i < numsArray.length; i++) {
            total += Integer.parseInt(numsArray[i]); // CANNOT += upon initialization. Must initialize elsewhere first, and then you can += here.
        } return total;
    }
}
