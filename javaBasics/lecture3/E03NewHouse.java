package lecture3;

import java.util.Scanner;

public class E03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int numF = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
//"Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        //5  	3.80	2.80	3	2.50
        double totalP = 0;
        double discP = 0;
        if (flowers.equals("Roses")) {
            if (numF > 80) {
                totalP = numF * 5.00;
                discP = totalP - (totalP * 0.10);
            } else {
                discP = numF * 5.00;
            }
        } else if (flowers.equals("Dahlias")) {
            if (numF > 90) {
                totalP = numF * 3.80;
                discP = totalP - (totalP * 0.15);
            } else {
                discP = numF * 3.80;
            }

        } else if (flowers.equals("Tulips")) {
            if (numF > 80) {
                totalP = numF * 2.80;
                discP = totalP - (totalP * 0.15);
            } else {
                discP = numF * 2.80;
            }

        } else if (flowers.equals("Narcissus")) {
            if (numF < 120) {
                totalP = numF * 3.00;
                discP = totalP + (totalP * 0.15);
            } else {
                discP = numF * 3.00;
            }

        } else if (flowers.equals("Gladiolus")) {
            if (numF < 80) {
                totalP = numF * 2.50;
                discP = totalP + (totalP * 0.20);
            } else {
                discP = numF * 2.50;
            }

        }
        double moneyLeft = Math.abs(budget - discP);
        if (budget > discP) {

            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numF, flowers, moneyLeft);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", moneyLeft);
        }

    }
}
