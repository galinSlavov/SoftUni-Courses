package Exercise01WorkingWithAbstraction;

import java.util.Scanner;

public class P01RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        printTop(n);
        printLineOfStars(n);

        System.out.println();

        printBottom(n);

    }

    public static void printTop(int n) {
        for (int i = 1; i < n; i++) {
            printLineOfSpaces(n - i);
            printLineOfStars(i);
            System.out.println();
        }
    }
    public static void printBottom(int n){
        for (int r = 1; r < n; r++) {
            printLineOfSpaces(r);
            printLineOfStars(n - r);
            System.out.println();
        }
    }

    public static void printLineOfStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
    }

    public static void printLineOfSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}
