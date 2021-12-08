package lecture3;

import java.util.Scanner;

public class E05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String dest = "";
        String camp = "";

        if (budget <= 100) {
                if (season.equals("summer")) {
                    camp = "Camp";
                    dest = "Bulgaria";
                    budget *= 0.30;
                } else if (season.equals("winter")) {
                    camp = "Hotel";
                    dest = "Bulgaria";
                    budget *= 0.70;
                }

        } else if (budget <= 1000 && budget >100) {
            if (season.equals("summer")) {
                camp = "Camp";
                dest = "Balkans";
                budget *= 0.40;
            } else if (season.equals("winter")) {
                camp = "Hotel";
                dest = "Balkans";
                budget *= 0.80;
            }

        } else if (budget > 1000) {
            if (season.equals("summer") || season.equals("winter")) {
                camp = "Hotel";
                dest = "Europe";
                budget *= 0.90;
            }
        }
        System.out.printf("Somewhere in %s\n", dest);
        System.out.printf("%s - %.2f", camp, budget);
    }
}
