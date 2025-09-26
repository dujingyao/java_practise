package homework;
public class no2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 99; i++) {

            if (i % 2 != 0) {
                sum += i;
            }

        }
        System.out.println("1+3+5+...+99 的和为: " + sum);
    }
}
