package exam1007;

import java.util.Scanner;

public class P01MerryPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityFoodPerMonth = Double.parseDouble(scanner.nextLine());
        double quantityHayPerMonth = Double.parseDouble(scanner.nextLine());
        double quantityCoverPerMonth = Double.parseDouble(scanner.nextLine());
        double pigWeight = Double.parseDouble(scanner.nextLine());

        double totalFood = quantityFoodPerMonth * 1000;
        double totalHay = quantityHayPerMonth * 1000;
        double totalCover = quantityCoverPerMonth * 1000;
        double totalWeight = pigWeight * 1000;

        double neededFoodPerDay = 300;

        int days = 0;
        boolean isFinished = false;

        for (int i = 1; i <= 30; i++) {

            if (totalFood <= 0 || totalHay <= 0 || totalCover <= 0) {
                isFinished = true;
                break;
            }
            totalFood = totalFood - neededFoodPerDay;
            days++;

            if (days % 2 == 0) {
                totalHay = totalHay - (totalFood * 0.05);

            }
            if (days % 3 == 0) {
                totalCover = totalCover - (totalWeight / 3);
            }

        }
        if (!isFinished) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", totalFood / 1000, totalHay / 1000, totalCover / 1000);
        } else {
            System.out.printf("Merry must go to the pet store!");
        }

    }
}
