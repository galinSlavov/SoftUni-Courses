package lecture2;

import java.util.Scanner;

public class E07WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double timeInSecondsForM = Double.parseDouble(scanner.nextLine());

        double totalDistance = distanceInMetres * timeInSecondsForM;
        double slowDown = Math.floor(distanceInMetres / 15) * 12.5;

        double totalTime = totalDistance + slowDown;
        double diff = Math.abs(totalTime - recordInSeconds);

        if (totalTime < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else if (totalTime >= recordInSeconds) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }

    }
}
