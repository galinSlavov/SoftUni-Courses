package FirstStepsInCoding.Excersises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prochitane na vhod1.	Депозирана сума – реално число в интервала [100.00 … 10000.00];
        //2.	Срок на депозита(в месеци) – цяло число в интервала [1…12];
        //3.	Годишен лихвен процент – реално число в интервала [0.00 …100.00];
        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double intrestRates = Double.parseDouble(scanner.nextLine());

        //izchisleniq сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double sumPerMonth = (depositSum * intrestRates/100) / 12;
        double totalSum = depositSum + months * sumPerMonth;

        //printirane
        System.out.println(totalSum);

    }
}
