package Exam180421;

import java.util.Scanner;

public class P05Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int goal = 8848;
        int start = 5364;
        int days = 1;

        while (!input.equals("END")) {
            int climbedMeters = Integer.parseInt(scanner.nextLine());

            if (input.equals("Yes")) {
                days++;
                start += climbedMeters;
                if (days > 5){
                    start -= climbedMeters;
                    System.out.println("Failed!");
                    System.out.println(start);
                    return;
                }
            }

            else if (input.equals("No")) {
                start += climbedMeters;
            }

            if (start >= goal) {
                System.out.printf("Goal reached for %d days!",days);
                return;
            } else if (days > 5) {
                start -= climbedMeters;
                System.out.println("Failed!");
                System.out.println(start);
            }
            input = scanner.nextLine();

        }
        System.out.println("Failed!");
        System.out.println(start);

    }
}

