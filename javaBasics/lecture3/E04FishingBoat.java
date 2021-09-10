package lecture3;

import java.util.Scanner;

public class E04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());


        double boutPrice = 0;

        switch (season) {
            case "Spring":
                boutPrice = 3000;
                if (fishers <= 6) {
                    boutPrice *= 0.90;

                } else if (fishers <= 11) {
                    boutPrice *= 0.85;

                } else {
                    boutPrice *= 0.75;
                }
                break;
            case "Summer":
            case "Autumn":
                boutPrice = 4200;
                if (fishers <= 6) {
                    boutPrice *= 0.90;

                } else if (fishers <= 11) {
                    boutPrice *= 0.85;

                } else {
                    boutPrice *= 0.75;
                }

                break;
            case "Winter":
                boutPrice = 2600;
                if (fishers <= 6) {
                    boutPrice *= 0.90;

                } else if (fishers <= 11) {
                    boutPrice *= 0.85;

                } else {
                    boutPrice *= 0.75;
                }
                break;
        }
        if (fishers % 2 == 0 && !season.equals("Autumn")) {
            boutPrice *= 0.95;
        }
        if (budget >= boutPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - boutPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", boutPrice - budget);
        }
    }
}
