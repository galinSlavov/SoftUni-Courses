package lecture2;

import java.util.Scanner;

public class PB01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double first = p1 * h;
        double second = p2 * h;
        double total = first + second;

        if (total < v) {
            double procent1 = 0;
            double procent2 = 0;
            total = total / v * 100;
            procent1 = first / total * 100;
            procent2 = second / total * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", total, procent1, procent2);
        } else if (total > v) {
            total = total - v;

            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, total);
        }
    }
}
