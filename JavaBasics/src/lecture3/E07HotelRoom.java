package lecture3;

import java.util.Scanner;

public class E07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int countNight = Integer.parseInt(scanner.nextLine());
//•	На първия ред е месецът – May, June, July, August, September или October
//•	На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]
        double studio = 0;
        double apart = 0;
        String st = "";
        String ap = "";
        String output = "";
        String output2 = "";
        if (month.equals("May") || month.equals("October")) {
            studio = countNight * 50.00;
            apart = countNight * 65.00;
            if (studio > 7 && studio < 14) {
                studio *= 0.95;
                st = "Studio";
            } else if (studio > 14) {
                studio *= 0.70;
                st = "Studio";
            }
            if (apart > 14) {
                apart *= 0.90;
                ap = "Apartment";
            }
            output = String.format("%s: %.2f lv.", ap, apart);
            output2 = String.format("%s: %.2f lv.", st, studio);


        } else if (month.equals("June") || month.equals("September")) {
            studio = countNight * 75.20;
            apart = countNight * 68.70;
            if (studio > 14 && studio !=14) {
                studio *= 0.80;
                st = "Studio";
            }
            if (apart > 14 && apart !=14) {
                apart *= 0.90;
                ap = "Apartment";
            }
            output = String.format("%s: %.2f lv.", ap, apart);
            output2 = String.format("%s: %.2f lv.", st, studio);

        } else if (month.equals("July") || month.equals("August")) {
            st = "Studio";
            studio = countNight * 76.00;
            apart = countNight * 77.00;
            if (apart > 14) {
                apart *= 0.90;
                ap = "Apartment";
            }
            output = String.format("%s: %.2f lv.", ap, apart);
            output2 = String.format("%s: %.2f lv.", st, studio);

        }
        System.out.println(output);
        System.out.println(output2);
    }
}
