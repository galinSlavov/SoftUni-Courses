package ExamPrep.march28;

import java.util.Scanner;

public class E04FoodForPet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double allFood = Double.parseDouble(scanner.nextLine());

        double totalEatenFromDog = 0;
        double totalEatenFromCat = 0;
        double biscuits = 0;
        for (int i = 1; i <= days; i++) {
            int eatenFoodDog = Integer.parseInt(scanner.nextLine());
            int eatenFoodCat = Integer.parseInt(scanner.nextLine());

            totalEatenFromDog = totalEatenFromDog + eatenFoodDog;
            totalEatenFromCat = totalEatenFromCat + eatenFoodCat;

            if (i % 3 == 0) {
                double currentBiscuits = (eatenFoodCat + eatenFoodDog) * 0.10;
                biscuits += currentBiscuits;
            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", (totalEatenFromCat + totalEatenFromDog) / allFood * 100);
        System.out.printf("%.2f%% eaten from the dog.%n",  totalEatenFromDog / (totalEatenFromCat + totalEatenFromDog) * 100);
        System.out.printf("%.2f%% eaten from the cat.%n", totalEatenFromCat / (totalEatenFromCat + totalEatenFromDog) * 100);
    }
}
