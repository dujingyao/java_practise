package experiment.No1;

public class d_Fibonacci {
    public static void main(String[] args) {
        int n = 20; // 计算前20个斐波那契数
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.print("前" + n + "个斐波那契数：");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
