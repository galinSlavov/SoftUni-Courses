package examPrepOfficial;

import java.util.Scanner;

public class P03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int countDrinks = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        if (drink.equals("Espresso")) {

            if (sugar.equals("Without")) {
                totalPrice = countDrinks * 0.90;
                totalPrice = totalPrice * 0.65;
            } else if (sugar.equals("Normal")) {
                totalPrice = countDrinks * 1.00;
            } else if (sugar.equals("Extra")) {
                totalPrice = countDrinks * 1.20;
            }
            if (countDrinks >= 5) {
                totalPrice = totalPrice * 0.75;
            }

        } else if (drink.equals("Cappuccino")) {

            if (sugar.equals("Without")) {
                totalPrice = countDrinks * 1.00;
                totalPrice = totalPrice * 0.65;
            } else if (sugar.equals("Normal")) {
                totalPrice = countDrinks * 1.20;
            } else if (sugar.equals("Extra")) {
                totalPrice = countDrinks * 1.60;
            }

        } else if (drink.equals("Tea")) {

            if (sugar.equals("Without")) {
                totalPrice = countDrinks * 0.50;
                totalPrice = totalPrice * 0.65;
            } else if (sugar.equals("Normal")) {
                totalPrice = countDrinks * 0.60;
            } else if (sugar.equals("Extra")) {
                totalPrice = countDrinks * 0.70;
            }
        }
        if (totalPrice > 15) {
            totalPrice = totalPrice * 0.80;

        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", countDrinks, drink, totalPrice);
    }
}
