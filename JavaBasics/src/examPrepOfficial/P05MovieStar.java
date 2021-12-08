package examPrepOfficial;

import java.util.Scanner;

public class P05MovieStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("ACTION")){
            String actor = input;

            if (actor.length() <= 15){
                double salary = Double.parseDouble(scanner.nextLine());
                budget -= salary;
            }else {
                budget = budget - (budget* 0.20);
            }

            if (budget < 0){
                break;
            }

            input = scanner.nextLine();
        }

        if (budget < 0){
            System.out.printf("We need %.2f leva for our actors.",Math.abs(budget));
        }else {
            System.out.printf("We are left with %.2f leva.",budget);
        }
    }
}
