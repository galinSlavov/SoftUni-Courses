package examPrepOfficial;

import java.util.Scanner;

public class P05Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        int totalClimbed = 0;
        int days = 1;
        boolean isClimbed = false;
        while (!input.equals("END") ) {
            int climbedMeters = Integer.parseInt(scanner.nextLine());

            if (input.equals("Yes")) {
                days++;
                totalClimbed = 5364 + climbedMeters;
            }else if (input.equals("No")) {
                totalClimbed = 5364 + climbedMeters;
            }
            if (totalClimbed >= 8848 || days > 5) {
                isClimbed = true;
                break;
            }
            climbedMeters = Integer.parseInt(scanner.nextLine());
            input = scanner.nextLine();
        }
        if (isClimbed) {
            System.out.printf("Goal reached for %d days!%n", days);
        }else {
            System.out.printf("Failed!%n%d",totalClimbed);
        }
    }
}
