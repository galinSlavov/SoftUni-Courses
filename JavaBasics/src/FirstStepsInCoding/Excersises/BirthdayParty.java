package FirstStepsInCoding.Excersises;

import java.awt.*;
import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //vhod•	Наем за залата – цяло число в интервала [100..10000]
        // •	Торта  – цената ѝ е 20% от наема на залата
        //•	Напитки – цената им е 45% по-малко от тази на тортата
        //•	Аниматор – цената му е 1/3 от цената за наема на залата
        double rent = Double.parseDouble(scanner.nextLine());
        //izchisleniq
        double cake = rent * 0.2;
        double drinks = cake - (cake * 0.45);
        double animation = rent / 3;

        Double totalSum = rent + cake + drinks + animation;

        //printirane
        System.out.println(totalSum);

    }
}
