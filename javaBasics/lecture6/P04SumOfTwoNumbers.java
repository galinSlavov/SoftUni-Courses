package lecture6;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean flag = false;
        for (int i = first; i <= last; i++) {
            for (int j = first; j <= last; j++) {
                counter++;
                if (i + j == magic) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, i + j);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }

        }
        if (!flag){
            System.out.printf("%d combinations - neither equals %d", counter, magic);
        }
    }
}
