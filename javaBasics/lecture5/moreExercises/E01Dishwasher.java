package lecture5.moreexercises;

import java.util.Scanner;

public class E01Dishwasher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBottles = Integer.parseInt(scanner.nextLine());

        int totalMlDetergent = countBottles * 750;
        int dishesCount = 0;
        int potsCount = 0;
        int counter = 0;
        while (totalMlDetergent >= 0) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            int items = Integer.parseInt(input);
            counter++;

            if (counter % 3 == 0) {
                int neededDetergent = items * 15;
                totalMlDetergent = totalMlDetergent - neededDetergent;

                if (totalMlDetergent >= 0) {
                    potsCount += items;
                }
            } else {
                int neededDetergent = items * 5;
                totalMlDetergent = totalMlDetergent - neededDetergent;

                if (totalMlDetergent >= 0) {
                    dishesCount += items;
                }
            }

        }
    if (totalMlDetergent >= 0){
        System.out.printf("Detergent was enough!\n" + "%d dishes and %d pots were washed.\n" + "Leftover detergent %d ml.\n"
                , dishesCount, potsCount, totalMlDetergent);
    }else {
        System.out.printf("Not enough detergent, %d ml. more necessary!", -totalMlDetergent);
    }

    }
}
