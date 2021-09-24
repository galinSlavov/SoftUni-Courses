package ExamPrep;

import java.util.Scanner;

public class E02FootballGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int win = 0;
        int loss = 0;
        int draw = 0;

        for (int game = 0; game < 3; game++) {
            String result = scanner.nextLine();

            char homeTeam = result.charAt(0);
            char guestTeam = result.charAt(2);

            if (homeTeam > guestTeam) {
                win++;
            } else if (homeTeam < guestTeam) {
                loss++;
            } else if (homeTeam == guestTeam) {
                draw++;
            }

        }
        System.out.printf("Team won %d games.\n", win);
        System.out.printf("Team lost %d games.\n", loss);
        System.out.printf("Drawn games: %d\n", draw);
    }
}
