package FirstStepsInCoding.Excersises;

import com.sun.nio.sctp.NotificationHandler;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int others = Integer.parseInt(scanner.nextLine());
        double dogsFood = dogs * 2.5;
        double othersFood = others * 4;
        double total = dogsFood + othersFood;
        System.out.printf("%.1f lv.", total);


    }
}
