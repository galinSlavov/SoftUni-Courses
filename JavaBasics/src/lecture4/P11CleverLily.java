package lecture4;

import java.util.Scanner;

public class P11CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washMachineP = Double.parseDouble(scanner.nextLine());
        int toyP = Integer.parseInt(scanner.nextLine());

        int countBrother = 0;
        int toysCount = 0;
        double sumMoney = 0;
        double money = 0;
        for (int i = 1; i <= age; i++) {

            if (i % 2 != 0) {
                toysCount++;
            } else {
                countBrother++;
                money = money + 10;
                sumMoney = sumMoney + money;
            }

        }

        int allToysMoney = toysCount * toyP;
        double allMoney = allToysMoney + sumMoney - countBrother;

        double diff = Math.abs(allMoney - washMachineP);
        if (allMoney >= washMachineP) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
