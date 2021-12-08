package ExamPrep.may03;

import java.util.Scanner;

public class E01FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Брой пилешки менюта – цяло число в интервала [0… 99]
        //•	Брой менюта с риба - цяло число в интервала [0… 99]
        //•	Брой вегетариански менюта - цяло число в интервала [0… 99]
        //•	Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.

        double chickenMenu = Double.parseDouble(scanner.nextLine());
        double fishMenu = Double.parseDouble(scanner.nextLine());
        double veggieMenu = Double.parseDouble(scanner.nextLine());

        double totalChicken = chickenMenu * 10.35;
        double totalFish = fishMenu * 12.40;
        double totalVeggie = veggieMenu * 8.15;

        double totalBill = totalChicken + totalFish + totalVeggie;
        double desert = totalBill * 0.20;
        double totalPriceForPay = totalBill + desert + 2.50;

        System.out.printf("Total: %.2f",totalPriceForPay);
    }
}

