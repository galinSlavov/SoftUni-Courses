package exercise04;

import java.util.Scanner;

public class E08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f",factorial(first)/ factorial(second));
    }

    public static double factorial(double n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
}
