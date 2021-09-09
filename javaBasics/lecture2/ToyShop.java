package lecture2;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //vhod1.	Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        //2.	Брой пъзели - цяло число в интервала [0… 1000]
        //3.	Брой говорещи кукли - цяло число в интервала [0 … 1000]
        //4.	Брой плюшени мечета - цяло число в интервала [0 … 1000]
        //5.	Брой миньони - цяло число в интервала [0 … 1000]
        //6.	Брой камиончета - цяло число в интервала [0 … 1000]
        double excPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int barbiesCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());
        //izchisleniq
        double puzzlePrice = puzzleCount * 2.6;
        double barbiesPrice = barbiesCount * 3;
        double bearsPrice = bearsCount * 4.1;
        double minionsPrice = minionsCount * 8.2;
        double trucksPrice = trucksCount * 2;

        double totalSum = puzzlePrice + barbiesPrice + bearsPrice + minionsPrice + trucksPrice;

        double totalToysSell = puzzleCount + barbiesCount + bearsCount + minionsCount + trucksCount;

        if (totalToysSell >= 50){
           totalSum = totalSum - (totalSum * 0.25);
        }

        double withoutRent = totalSum - (totalSum * 0.1);

        if (withoutRent >= excPrice){
            System.out.printf("Yes! %.2f lv left.", withoutRent - excPrice);}
        else {
            System.out.printf("Not enough money! %.2f lv needed.", excPrice - withoutRent);}

        }
        //printirane
    }

