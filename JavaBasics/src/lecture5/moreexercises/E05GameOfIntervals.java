package lecture5.moreexercises;

import java.util.Scanner;

public class E05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int turnsInGame = Integer.parseInt(scanner.nextLine());

        int between09 = 0;
        int between1019 = 0;
        int between2029 = 0;
        int between3039 = 0;
        int between4050 = 0;
        int invalid = 0;
        int totalCount = 0;
        double totalScore = 0;
        for (int i = 1; i <= turnsInGame; i++) {
            int gameNumbers = Integer.parseInt(scanner.nextLine());

            if (gameNumbers >= 0 && gameNumbers <= 9) {
                between09++;
                totalCount++;
                totalScore = totalScore + gameNumbers * 0.20;
            } else if (gameNumbers >= 10 && gameNumbers <= 19) {
                between1019++;
                totalCount++;
                totalScore = totalScore + gameNumbers * 0.30;
            } else if (gameNumbers >= 20 && gameNumbers <= 29) {
                between2029++;
                totalCount++;
                totalScore = totalScore + gameNumbers * 0.40;
            } else if (gameNumbers >= 30 && gameNumbers <= 39) {
                between3039++;
                totalCount++;
                totalScore = totalScore + 50.00;
            } else if (gameNumbers >= 40 && gameNumbers <= 50) {
                between4050++;
                totalCount++;
                totalScore = totalScore + 100.00;
            } else {
                invalid++;
                totalCount++;
                totalScore = totalScore / 2.00;
            }
        }
        System.out.printf("%.2f\n",totalScore);
        System.out.printf("From 0 to 9: %.2f%%\n",(1.0 * between09/totalCount) * 100);
        System.out.printf("From 10 to 19: %.2f%%\n",(1.0 * between1019/totalCount) * 100);
        System.out.printf("From 20 to 29: %.2f%%\n",(1.0 * between2029/totalCount) * 100);
        System.out.printf("From 30 to 39: %.2f%%\n",(1.0 * between3039/totalCount) * 100);
        System.out.printf("From 40 to 50: %.2f%%\n",(1.0 * between4050/totalCount) * 100);
        System.out.printf("Invalid numbers: %.2f%%\n",(1.0 * invalid/totalCount) * 100);
    }
}
