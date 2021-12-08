package ExamPrep.april20;

import java.util.Scanner;

public class E05EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBake = Integer.parseInt(scanner.nextLine());

        int sugarCount = 0;
        int flourCount = 0;
        int maxSugar = 0;
        int maxFlour = 0;

        for (int i = 1; i <= countBake; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());
            sugarCount += sugar;
            flourCount += flour;
            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            if (flour > maxFlour) {
                maxFlour = flour;
            }
        }
        double packageSugar = Math.ceil(sugarCount / 950.0);
        double packageFlour = Math.ceil(flourCount / 750.0);

        System.out.printf("Sugar: %.0f\n", packageSugar);
        System.out.printf("Flour: %.0f\n", packageFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams. ", maxFlour, maxSugar);
    }
}