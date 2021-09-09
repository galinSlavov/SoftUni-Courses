package lecture2;

import java.util.Scanner;

public class PB02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restDays = Integer.parseInt(scanner.nextLine());

        double restMinutes = restDays * 127;
        double workingMinutes = (365 - restDays) * 63;
        double totalMinutes = restMinutes + workingMinutes;

        if (totalMinutes < 30000) {
            totalMinutes = 30000 - totalMinutes;
            double h = totalMinutes / 60;
            double m = totalMinutes % 60;
            if(h > 23){
                h = 0;
            }
            System.out.printf("Tom sleeps well\n%.0f hours and %.0f minutes less for play", h, m);

        } else if (totalMinutes > 30000) {
            totalMinutes = totalMinutes - 30000;
            double h = totalMinutes / 60;
            double m = totalMinutes % 60;
            if(h > 23){
                h = 0;
            }
            System.out.printf("Tom will run away\n%.0f hours and %.0f minutes more for play", h, m);

        }
    }
}
