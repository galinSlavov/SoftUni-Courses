package lecture3;

import java.util.Scanner;

public class P13SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int restDays = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String grade = scanner.nextLine();

        int restNight = restDays - 1;
        double price = 0;
        double totalPrice = 0;
        if (restDays < 10) {
            if (room.equals("room for one person")) {
                price = restNight * 18.00;
                totalPrice = price - 0;
            } else if (room.equals("apartment")) {
                price = restNight * 25.00;
                totalPrice = price - (price * 0.30);
            } else if (room.equals("president apartment")) {
                price = restNight * 35.00;
                totalPrice = price - (price * 0.10);
            }

        } else if (restDays >= 10 && restDays <= 15) {
            if (room.equals("room for one person")) {
                price = restNight * 18.00;
                totalPrice = price - 0;
            } else if (room.equals("apartment")) {
                price = restNight * 25.00;
                totalPrice = price - (price * 0.35);
            } else if (room.equals("president apartment")) {
                price = restNight * 35.00;
                totalPrice = price - (price * 0.15);
            }

        } else if (restDays > 15) {
            if (room.equals("room for one person")) {
                price = restNight * 18.00;
                totalPrice = price - 0;
            } else if (room.equals("apartment")) {
                price = restNight * 25.00;
                totalPrice = price - (price * 0.50);
            } else if (room.equals("president apartment")) {
                price = restNight * 35.00;
                totalPrice = price - (price * 0.20);
            }
        }
        if (grade.equals("positive")) {
            totalPrice = totalPrice + (totalPrice * 0.25);
        } else if (grade.equals("negative")) {
            totalPrice = totalPrice - (totalPrice * 0.10);
        }
        System.out.printf("%.2f", totalPrice);

    }
}
