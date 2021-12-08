package ExamPrep;

import java.util.Scanner;

public class E06HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedHeight = Integer.parseInt(scanner.nextLine());

        int totalJumpTimes = 0;
        int totalFailJump = 0;
        boolean stop = false;

        for (int i = wantedHeight - 30; i <= wantedHeight; i += 5) {

            for (int j = 1; j <= 3; j++) {
                int heightIvanov = Integer.parseInt(scanner.nextLine());
                if (heightIvanov > i) {
                    totalJumpTimes++;
                    totalFailJump = 0;
                    break;
                } else {
                    totalFailJump++;
                    totalJumpTimes++;
                }

            }
            if (totalFailJump == 3) {
                System.out.printf("Tihomir failed at %scm after %s jumps.", i, totalJumpTimes);
                return;
            }

        }
        if (!stop) {
            System.out.printf("Tihomir succeeded, he jumped over %scm after %s jumps.", wantedHeight, totalJumpTimes);
        }

    }
}

