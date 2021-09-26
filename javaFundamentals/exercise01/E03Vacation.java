package exercise01;

import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double pricePerson = 0;
        double totalPrice = 0;


        if (typeOfGroup.equals("Students")) {
            if (dayOfWeek.equals("Friday"))
                pricePerson = 8.45;
            if (dayOfWeek.equals("Saturday"))
                pricePerson = 9.80;
            if (dayOfWeek.equals("Sunday"))
                pricePerson = 10.46;
        } else if (typeOfGroup.equals("Business")) {
            if (dayOfWeek.equals("Friday"))
                pricePerson = 10.90;
            if (dayOfWeek.equals("Saturday"))
                pricePerson = 15.60;
            if (dayOfWeek .equals("Sunday"))
                pricePerson = 16;
        } else if (typeOfGroup.equals("Regular")) {
            if (dayOfWeek.equals("Friday"))
                pricePerson = 15;
            if (dayOfWeek.equals("Saturday"))
                pricePerson = 20;
            if (dayOfWeek.equals("Sunday"))
                pricePerson = 22.50;
        }

        if (typeOfGroup.equals("Business") && number >= 100) {
            number -= 10;
        }
        totalPrice = pricePerson * number;

        if (typeOfGroup.equals("Students") && number >= 30)
            totalPrice *= 0.85;

        if (typeOfGroup.equals("Regular") && (number >= 10 && number <= 20))
            totalPrice *= 0.95;
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
