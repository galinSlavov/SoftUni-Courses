package examPrepOfficial;

import java.util.Scanner;

public class P01TaxAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int adultTicketCount = Integer.parseInt(scanner.nextLine());
        int kidsTicketCount = Integer.parseInt(scanner.nextLine());
        double adultPrice = Double.parseDouble(scanner.nextLine());
        double servicePrice = Double.parseDouble(scanner.nextLine());

        double kidsPrice = adultPrice * 0.30;

        double adultPriceWithService = adultPrice + servicePrice;
        double kidsPriceWithService = kidsPrice + servicePrice;

        double allSum = (adultPriceWithService * adultTicketCount) + (kidsPriceWithService * kidsTicketCount);

        double profit = allSum * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",name, profit);
    }
}
