package ExamPrep;

import java.util.Scanner;

public class E05TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoint = Integer.parseInt(scanner.nextLine());

        int newPoints = 0;
        int wins = 0;
        for (int i = 0; i < tournaments; i++) {
            //•	Достигнат етап от турнира – текст – "W", "F" или "SF"
            String stage = scanner.nextLine();
            if (stage.equals("W")) {
                newPoints += 2000;
                wins++;
            } else if (stage.equals("F")) {
                newPoints += 1200;

            } else if (stage.equals("SF")) {
                newPoints += 720;

            }

        }
        System.out.printf("Final points: %d%n", startPoint + newPoints);
        System.out.printf("Average points: %d%n", newPoints / tournaments);
        System.out.printf("%.2f%%", wins * 1.0 / tournaments * 100);
    }
}
