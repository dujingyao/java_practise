package experiment.No1;

public class b_year {
    public static void main(String[] args) {
        for (int year = 1800; year <= 2024; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + "是闰年");
            }
        }
    }
}
