package lecture2;

import java.util.Scanner;

public class E06GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        //определен брой статисти, облекло за всеки един статист и декор.
        if (actors > 150) {
            //priceClothes = priceClothes - priceClothes * 0.1;
            priceClothes *= 0.9;
        }

        double neededMoney = actors * priceClothes + decor;

        double difference = Math.abs(neededMoney - budget);
        if (neededMoney > budget) {
            System.out.printf("Not enough money!\n" +
                    "Wingard needs %.2f leva more.", difference);
        }else if(neededMoney <= budget){
            System.out.printf("Action!\n" +
                    "Wingard starts filming with %.2f leva left.", difference);
        }
    }
}
