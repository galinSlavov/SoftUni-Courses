package ExamPrep.march28;

import java.util.Scanner;

public class E02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        //2.	Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        //3.	Времето в секунди, за което изкачва 1 м. – реално число в интервала [0.00 … 1000.00]

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceM = Double.parseDouble(scanner.nextLine());
        double timeInSecondsForMeter = Double.parseDouble(scanner.nextLine());

        double neededMeters = distanceM * timeInSecondsForMeter;
        double slowDown = Math.floor(distanceM / 50) * 30;
        double totalTime = neededMeters + slowDown;

        if (totalTime > recordInSeconds){
            System.out.printf("No! He was %.2f seconds slower.",totalTime - recordInSeconds);
        }else {
            System.out.printf("Yes! The new record is %.2f seconds.",totalTime);
        }
    }
}
