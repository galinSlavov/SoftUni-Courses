package ExamPrep.april07;

import java.util.Scanner;

public class P02GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //Ред 1.	Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
        //Ред 2.	Брой на статистите – цяло число в интервала [1 … 500]
        //Ред 3.	Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]
        double movieBudget = Double.parseDouble(scanner.nextLine());
        int countStatist = Integer.parseInt(scanner.nextLine());
        double priceForStatist = Double.parseDouble(scanner.nextLine());

        double decor = movieBudget * 0.10;
        double totalForStatist = 0;
        if (countStatist > 150){
            totalForStatist = countStatist * priceForStatist * 0.90;
        }else {
            totalForStatist = countStatist * priceForStatist;
        }
        double totalNeededSum = decor + totalForStatist;
        if (totalNeededSum > movieBudget){
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.",totalNeededSum - movieBudget);
        }else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.",movieBudget - totalNeededSum);
        }
    }
}
