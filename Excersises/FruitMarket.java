package FirstStepsInCoding.Excersises;

import java.util.Scanner;
import java.util.function.DoublePredicate;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesLv = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangesKg = Double.parseDouble(scanner.nextLine());
        double raspberriesKg = Double.parseDouble(scanner.nextLine());
        double strawberriesKg = Double.parseDouble(scanner.nextLine());


        double raspberriesLv = strawberriesLv * 0.5;
        double orangesLV = raspberriesLv - (0.4 * raspberriesLv);
        double bananasLv = raspberriesLv - (0.8 * raspberriesLv);
        double raspSum = raspberriesLv * raspberriesKg;
        double orangesSum = orangesLV * orangesKg;
        double bananasSum = bananasLv * bananasKg;
        double strawSum = strawberriesLv * strawberriesKg;
        double totalSum = raspSum + orangesSum + bananasSum + strawSum;

        System.out.printf("%.2f", totalSum);
    }
}



















































