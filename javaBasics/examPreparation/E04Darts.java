package ExamPrep;

import java.util.Scanner;

public class E04Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        //След това до получаване на команда "Retire" се четат многократно по два реда:
        //1.	Поле – текст ("Single", "Double" или "Triple")
        //2.	Точки – цяло число в интервала [0… 100]

        int startPoints = 301;
        int goodShots = 0;
        int badShots = 0;

        while (startPoints != 0) {
            String shot = scanner.nextLine();

            if (shot.equals("Retire")) {
                System.out.printf("%s retired after %d unsuccessful shots.", name, badShots);
                break;
            }
            int points = Integer.parseInt(scanner.nextLine());
            if (shot.equals("Single")) {
                if (points <= startPoints && startPoints > 0) {
                    startPoints -= points;
                    goodShots++;
                } else {
                    badShots++;
                }
            }
            if (shot.equals("Double")) {
                points *= 2;
                if (points <= startPoints && startPoints > 0) {
                    startPoints -= points;
                    goodShots++;
                } else {
                    badShots++;
                }
            }
            if (shot.equals("Triple")) {
                points *= 3;
                if (points <= startPoints && startPoints > 0) {
                    startPoints -= points;
                    goodShots++;
                } else {
                    badShots++;
                }
            }
            if (startPoints == 0) {
                System.out.printf("%s won the leg with %d shots.", name, goodShots);
                break;
            }
        }

    }
}
