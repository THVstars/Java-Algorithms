public class WeeklySalary {
    public static void main(String[] args) {
        System.out.println(WeeklySalary(new int[]{8, 10, 9, 10, 10, 11, 8}));
    }

    public static int WeeklySalary(int[] hours) {
        int salary = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i <= 4) {
                if (hours[i] <= 8) {
                    salary += hours[i] * 10;
                } else {
                    salary += hours[i] * 10 + (hours[i] - 8) * 5;
                }
            } else {
                if (hours[i] <= 8) {
                    salary += hours[i] * 20;
                } else {
                    salary += hours[i] * 20 + (hours[i] - 8) * 10;
                }
            }
        } return salary;
    }
}
