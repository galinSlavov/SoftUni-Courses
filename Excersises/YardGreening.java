package FirstStepsInCoding.Excersises;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double greenMeters = Double.parseDouble(scanner.nextLine());
        double totalSum = greenMeters * 7.61;
        double discount = totalSum - (totalSum * 0.18);
        double afterDisc = totalSum - discount;
        System.out.printf("The final price is: %.2f lv.\nThe discount is: %.2f lv.", discount, afterDisc);
        }
    }

