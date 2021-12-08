package ExamPrep.may03;

import java.util.Scanner;

public class E05DivisionWithoutReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        for (int i = 1; i <= n1; i++) {
            int n2 = Integer.parseInt(scanner.nextLine());

            if (n2 % 2 == 0){
                p1++;
            }
            if (n2 % 3 ==0){
                p2++;
            }
            if (n2 % 4 == 0){
                p3++;
            }

        }
        System.out.printf("%.2f%%\n",((p1 * 1.0) / n1 )* 100);
        System.out.printf("%.2f%%\n",((p2 * 1.0) / n1 )* 100);
        System.out.printf("%.2f%%",((p3 * 1.0) / n1 )* 100);
    }
}
