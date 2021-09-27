package lecture02;

import java.util.Scanner;

public class E10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <= n ; num++) {
            int digits = num;
            int sum = 0;

            while(digits > 0){
                int currentDigits = digits % 10;
                sum = sum + currentDigits;
                digits = digits / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11){
                System.out.printf(num + " -> True\n");
            }else {
                System.out.printf(num + " -> False\n");
            }
        }
    }
}
