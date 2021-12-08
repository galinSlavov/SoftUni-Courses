package FirstStepsInCoding.Excersises;

import java.util.Scanner;

public class CharityCampaing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prochitane na whod1.	Броят на дните, в които тече кампанията – цяло число в интервала [0 … 365]
       // 2.	Броят на сладкарите – цяло число в интервала [0 … 1000]
      //  3.	Броят на тортите – цяло число в интервала [0… 2000]
       // 4.	Броят на гофретите – цяло число в интервала [0 … 2000]
       // 5.	Броят на палачинките – цяло число в интервала [0 … 2000]
        int days = Integer.parseInt(scanner.nextLine());
        int chefs = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffels = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());
        //izchisleniqИзчисляваме сумата, която се изкарва на ден за всеки един от продуктите, направени от 1 сладкар:
        //Торти: 14 * 45 = 630 лв.;
        //Гофрети: 30 * 5.80 = 174 лв.;
        //Палачинки: 16 * 3.20 = 51.20 лв.
        //Обща сума за един ден от всички сладкари: (630 + 174 + 51.20) * 8 = 6841.60 лв.
        //Сума събрана от цялата кампания: 6841.60 * 23 = 157356.8лв.
        //Сума след покриване на разходите: 157356.8 - 1/8 от 157356.8 = 137687.2 лв.
        double cakesSum = cakes *  45;
        double waffelsSum = waffels * 5.80;
        double pancakesSum = pancakes * 3.20;
        double sumPerDay = (cakesSum + waffelsSum + pancakesSum) * chefs;
        double totalSum = sumPerDay * days;
        double charitySum = totalSum - totalSum / 8;

        //printirane
        System.out.printf("%.2f", charitySum);

    }
}
