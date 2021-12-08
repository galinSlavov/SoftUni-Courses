package ExamPrep.july07;

import java.util.Scanner;

public class E004Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wantedMoney = Double.parseDouble(scanner.nextLine());
        String cocktail = scanner.nextLine();


        double totalIncome = 0;
        double totalCocktailsPrice = 0;

        while (!cocktail.equals("Party")) {
            int countCocktails = Integer.parseInt(scanner.nextLine());
            double priceForCocktail = cocktail.length();

            totalCocktailsPrice = priceForCocktail * countCocktails;

            if (totalIncome % 2 != 0) {
                totalIncome *= 0.75;
            }
            totalIncome += totalCocktailsPrice;
            if (totalIncome >= wantedMoney) {
                System.out.println("Target acquired.");
                break;
            }
            cocktail = scanner.nextLine();
        }
        double diff = wantedMoney - totalIncome;
        if (cocktail.equals("Party!")) {

            System.out.printf("%.2f", diff);
        }
        System.out.printf("%.2f", diff);
    }
}
