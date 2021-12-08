package ExamPrep;

import java.util.Scanner;

public class E01TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceRocket = Double.parseDouble(scanner.nextLine());
        int countRockets = Integer.parseInt(scanner.nextLine());
        int countSnickers = Integer.parseInt(scanner.nextLine());

        double totalRocketP = priceRocket * countRockets;
        double snickersP = priceRocket / 6;
        double totalSnickersP = snickersP * countSnickers;
        double otherEquip = (totalSnickersP + totalRocketP) * 0.20;
        double totalAllP = totalRocketP + totalSnickersP + otherEquip;

        double jockovic = totalAllP / 8;
        double sponsors = totalAllP * 7/8;

        System.out.printf("Price to be paid by Djokovic %.0f\n", Math.floor(jockovic));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(sponsors));
    }
}
