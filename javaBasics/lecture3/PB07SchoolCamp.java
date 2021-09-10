package lecture3;

import java.util.Scanner;

public class PB07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int child = Integer.parseInt(scanner.nextLine());
        int nightCount = Integer.parseInt(scanner.nextLine());

        String sports = "";
        double nightsTotal = 0;
        if (season.equals("Winter")) {

            if (group.equals("boys")) {
                sports = "Judo";
                nightsTotal =child * nightCount * 9.60;
            } else if (group.equals("girls")) {
                sports = "Gymnastics";
                nightsTotal =child * nightCount * 9.60;
            } else if (group.equals("mixed")) {
                sports = "Ski";
                nightsTotal =child * nightCount * 10.00;
            }
            if (child >= 50) {
                nightsTotal = nightsTotal * 0.50;
            } else if (child >= 20 && child < 50) {
                nightsTotal = nightsTotal - (nightsTotal * 0.15);
            } else if (child >= 10 && child < 20) {
                nightsTotal =nightsTotal - (nightsTotal * 0.05);
            }

        } else if (season.equals("Spring")) {

            if (group.equals("boys")) {
                sports = "Tennis";
                nightsTotal =child * nightCount * 7.20;
            } else if (group.equals("girls")) {
                sports = "Athletics";
                nightsTotal =child * nightCount * 7.20;
            } else if (group.equals("mixed")) {
                sports = "Cycling";
                nightsTotal =child * nightCount * 9.50;
            }
            if (child >= 50) {
                nightsTotal = nightsTotal * 0.50;
            } else if (child >= 20 && child < 50) {
                nightsTotal = nightsTotal - (nightsTotal * 0.15);
            } else if (child >= 10 && child < 20) {
                nightsTotal =nightsTotal - (nightsTotal * 0.05);
            }
        } else if (season.equals("Summer")) {

            if (group.equals("boys")) {
                sports = "Football";
                nightsTotal =child * nightCount * 15.00;
            } else if (group.equals("girls")) {
                sports = "Volleyball";
                nightsTotal =child * nightCount * 15.00;
            } else if (group.equals("mixed")) {
                sports = "Swimming";
                nightsTotal =child * nightCount * 20.00;
            }
            if (child >= 50) {
                nightsTotal = nightsTotal * 0.50;
            } else if (child >= 20 && child < 50) {
                nightsTotal = nightsTotal - (nightsTotal * 0.15);
            } else if (child >= 10 && child < 20) {
                nightsTotal =nightsTotal - (nightsTotal * 0.05);
            }
        }
        System.out.printf("%s %.2f lv.", sports, nightsTotal);
    }
}
