package lecture3;

import java.util.Scanner;

public class PB04RentCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – Бюджет – реално число в интервала [10.00...10000.00]
        //•	Втори ред –  Сезон – текст "Summer" или "Winter"
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String car = "";
        String clasS = "";

        double result = 0;

        if (season.equals("Summer")) {
            if (budget <= 100) {
                clasS = "Economy class";
                car = "Cabrio";
                result = budget * 0.35;
            } else if (budget > 100 && budget <= 500) {
                clasS = "Compact class";
                car = "Cabrio";
                result = budget * 0.45;
            } else if (budget > 500) {
                clasS = "Luxury class";
                car = "Jeep";
                result = budget * 0.90;
            }

        } else if (season.equals("Winter")) {
            if (budget <= 100) {
                clasS = "Economy class";
                car = "Jeep";
                result = budget * 0.65;
            } else if (budget > 100 && budget <= 500) {
                clasS = "Compact class";
                car = "Jeep";
                result = budget * 0.80;
            } else if (budget > 500) {
                clasS = "Luxury class";
                car = "Jeep";
                result = budget * 0.90;
            }

        }
        System.out.printf("%s\n", clasS);
        System.out.printf("%s - %.2f", car, result);
    }
}
