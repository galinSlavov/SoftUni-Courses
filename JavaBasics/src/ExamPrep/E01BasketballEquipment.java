package ExamPrep;

import java.util.Scanner;

public class E01BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double taxForTrain = Double.parseDouble(scanner.nextLine());

        double snickers = taxForTrain - (taxForTrain * 0.40);
        double equip = snickers - (snickers * 0.20);
        double ball = equip / 4;
        double accessories = ball / 5;
        double total = taxForTrain + snickers + equip + ball + accessories;

        System.out.printf("%.2f", total);
    }
}
