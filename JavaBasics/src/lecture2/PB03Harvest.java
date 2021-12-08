package lecture2;

import java.util.Scanner;

public class PB03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	1ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000]
        //•	2ри ред: Y грозде за един кв.м – реално число в интервала [0.00 … 10.00]
        //•	3ти ред: Z нужни литри вино – цяло число в интервала [10 … 600]
        //•	4ти ред: брой работници – цяло число в интервала [1 … 20]
        int metresLoz = Integer.parseInt(scanner.nextLine());
        double grapePerM = Double.parseDouble(scanner.nextLine());
        int neededLiters = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double totalGrape = metresLoz * grapePerM;
        double wine = (0.40 * totalGrape) / 2.50;

        if(wine > neededLiters){
            double leftWine = wine - neededLiters;
            double forWorkers = leftWine / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n" +
                    "%.0f liters left -> %.0f liters per person.",Math.floor(wine), Math.ceil(leftWine),Math.ceil(forWorkers));
        }else {
            double neededWine = neededLiters - wine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",neededWine);
        }


    }
}
