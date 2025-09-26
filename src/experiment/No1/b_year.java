package experiment.No1;

public class b_year {
    public static void main(String[] args) {
        int i=0;
        for (int year = 1800; year <= 2024; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                if(i%10==0){
                    System.out.println();
                }
                i++;
                System.out.print(year + " ");
            }
        }
    }
}
