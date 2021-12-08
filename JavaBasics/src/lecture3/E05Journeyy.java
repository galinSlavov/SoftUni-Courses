package lecture3;

import java.util.Scanner;

public class E05Journeyy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String places = "";
        String location = "";
        double result = 0;

        if (season.equals("Summer")) {
            if (budget <= 100) {
                places = "Camp";
                location = "Bulgaria";
                result = budget * 0.30;
            } else if (budget > 100 && budget <= 1000) {
                places = "Camp";
                location = "Balkans";
                result = budget * 0.40;
            } else if (budget > 1000) {
                places = "Camp";
                location = "Europe";
                result = budget * 0.90;
            }

        } else if (season.equals("Winter")) {
            if (budget <= 100) {
                places = "Hotel";
                location = "Bulgaria";
                result = budget * 0.70;
            } else if (budget > 100 && budget <= 1000) {
                places = "Hotel";
                location = "Balkans";
                result = budget * 0.80;
            } else if (budget > 1000) {
                places = "Hotel";
                location = "Europe";
                result = budget * 0.90;
            }

        }
        System.out.printf("Somewhere in %s\n", location);
        System.out.printf("%s - %.2f", places, result);
    }
}
