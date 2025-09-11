package experiment.No1;

import java.util.Scanner;

// 输入一行字符，分别统计出大写字母、小写字母、空格、数字和其他字符的个数
public class a_character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一行字符：");
        String str = scanner.nextLine();
        int upper = 0, lower = 0, space = 0, digit = 0, other = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            } else if (ch == ' ') {
                space++;
            } else if (ch >= '0' && ch <= '9') {
                digit++;
            } else {
                other++;
            }
        }
        System.out.println("大写字母个数：" + upper);
        System.out.println("小写字母个数：" + lower);
        System.out.println("空格个数：" + space);
        System.out.println("数字个数：" + digit);
        System.out.println("其他字符个数：" + other);
    }
}
