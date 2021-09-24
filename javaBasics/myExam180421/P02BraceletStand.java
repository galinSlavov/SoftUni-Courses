package Exam180421;

import java.util.Scanner;

public class P02BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – джобните на Тереза на ден – реално число в интервала [1.00 ...100.00]
        //•	Втори ред – парите, които тя печели на ден от продажби – реално число в интервала [1.00...1000.00]
        //•	Трети ред – разходите на Тереза за целия период – реално число в интервала [1.00...1000.00]
        //•	Четвърти ред – цената на подаръка – реално число в интервала [1.00...10000.00]

        double moneyPerDay = Double.parseDouble(scanner.nextLine());
        double earnedMoneyPerDay = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());
        double priceForGift = Double.parseDouble(scanner.nextLine());

        double totalSaveMoney = moneyPerDay * 5;
        double totalEarnedMoney = earnedMoneyPerDay * 5;
        double totalMoney = totalEarnedMoney + totalSaveMoney;
        double moneyAfterExpenses = totalMoney - expenses;

        if (moneyAfterExpenses > priceForGift){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",moneyAfterExpenses);
        }else {
            System.out.printf("Insufficient money: %.2f BGN.",priceForGift - moneyAfterExpenses);
        }
    }
}
