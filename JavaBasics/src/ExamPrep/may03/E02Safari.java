package ExamPrep.may03;

import java.util.Scanner;

public class E02Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Бюджет – реално число в интервала [0.00… 10000.00]
        //•	Колко литра гориво ще са им нужни – реално число в интервала [1.00… 50.00]
        //•	Ден от седмицата – текст с възможности "Saturday" и "Sunday"

        double budget = Double.parseDouble(scanner.nextLine());
        double neededLitersFuel = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        double totalPriceForFuel = neededLitersFuel * 2.10;
        double excursionWithFuel = totalPriceForFuel + 100;

        if (dayOfWeek.equals("Saturday")){
            excursionWithFuel *= 0.90;
        }else if (dayOfWeek.equals("Sunday")){
            excursionWithFuel *= 0.80;
        }
        if (budget > excursionWithFuel){
            System.out.printf("Safari time! Money left: %.2f lv.",Math.abs(budget - excursionWithFuel));
        }else {
            System.out.printf("Not enough money! Money needed: %.2f lv.",Math.abs(budget - excursionWithFuel));
        }
    }
}
