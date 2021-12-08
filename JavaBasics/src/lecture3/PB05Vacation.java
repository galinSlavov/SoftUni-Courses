package lecture3;

import java.util.Scanner;

public class PB05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String places = "";
        String location = "";

        double result = 0;

        if (season.equals("Summer")) {
            if (budget <= 1000) {
                places = "Camp";
                location = "Alaska";
                result = budget * 0.65;
            } else if (budget > 1000 && budget <= 3000) {
                places = "Hut";
                location = "Alaska";
                result = budget * 0.80;
            } else if (budget > 3000) {
                places = "Hotel";
                location = "Alaska";
                result = budget * 0.90;
            }

        } else if (season.equals("Winter")) {
            if (budget <= 1000) {
                places = "Camp";
                location = "Morocco";
                result = budget * 0.45;
            } else if (budget > 1000 && budget <= 3000) {
                places = "Hut";
                location = "Morocco";
                result = budget * 0.60;
            } else if (budget > 3000) {
                places = "Hotel";
                location = "Morocco";
                result = budget * 0.90;
            }

        }
        System.out.printf("%s - %s - %.2f", location, places, result);
    }
}
