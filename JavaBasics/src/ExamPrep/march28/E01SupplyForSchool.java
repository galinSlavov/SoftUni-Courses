package ExamPrep.march28;

import java.util.Scanner;

public class E01SupplyForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред - брой пакети химикали. Цяло число в интервала [0...100]
        //•	Втори ред - брой пакети маркери. Цяло число в интервала [0...100]
        //•	Трети ред - литър препарат за почистване на дъска. Реално число в интервала [0.00…50.00]
        //•	Четвърти ред - процентът намаление. Цяло число в интервала [0...100]

        int countPackagesPencils = Integer.parseInt(scanner.nextLine());
        int countPackagesMarkers = Integer.parseInt(scanner.nextLine());
        double litersPreparat = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double totalPencils = countPackagesPencils * 5.80;
        double totalMarkers = countPackagesMarkers * 7.20;
        double totalPreparat = litersPreparat * 1.20;
        double totalPrice = totalMarkers + totalPreparat + totalPencils;
        double afterDiscount = totalPrice - ((totalPrice * discount)/100);

        System.out.printf("%.3f",afterDiscount);
    }
}
