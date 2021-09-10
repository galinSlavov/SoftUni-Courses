package lecture3.pbexercises;

import java.util.Scanner;

public class PB01MatchTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetT = Double.parseDouble(scanner.nextLine());
        String categ = scanner.nextLine();
        int countPeople = Integer.parseInt(scanner.nextLine());

        double ticket = 0;
        double result = 0;
        double budget = 0;

        if (categ.equals("Normal")) {
            if (countPeople <= 4) {
                budget = budgetT * 0.25;
            } else if (countPeople >= 5 && countPeople <= 9) {
                budget = budgetT * 0.40;
            } else if (countPeople >= 10 && countPeople <= 24) {
                budget = budgetT * 0.50;
            } else if (countPeople >= 25 && countPeople <= 49) {
                budget = budgetT * 0.60;
            } else if (countPeople >= 50) {
                budget = budgetT * 0.75;
            }
            ticket = countPeople * 249.99;
            if (budget > ticket) {
                result = budget - ticket;
                System.out.printf("Yes! You have %.2f leva left.", result);
            } else if (budget < ticket) {
                result = ticket - budget;
                System.out.printf("Not enough money! You need %.2f leva.", result);
            }
        } else if (categ.equals("VIP")) {
            if (countPeople <= 4) {
                budget = budgetT * 0.25;
            } else if (countPeople >= 5 && countPeople <= 9) {
                budget = budgetT * 0.40;
            } else if (countPeople >= 10 && countPeople <= 24) {
                budget = budgetT * 0.50;
            } else if (countPeople >= 25 && countPeople <= 49) {
                budget = budgetT * 0.60;
            } else if (countPeople >= 50) {
                budget = budgetT * 0.75;
            }
            ticket = countPeople * 499.99;
            if (budget > ticket) {
                result = budget - ticket;
                System.out.printf("Yes! You have %.2f leva left.", result);
            } else if (budget < ticket) {
                result = ticket - budget;
                System.out.printf("Not enough money! You need %.2f leva.", result);
            }
        }
    }
}
