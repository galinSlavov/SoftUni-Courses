package lecture3;

import java.util.Scanner;

public class E01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentDays = Integer.parseInt(scanner.nextLine());
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (currentDays >= 1 && currentDays <= 7) {
            System.out.println(days[currentDays - 1]);
        }else {
            System.out.println("Invalid day!");
        }

    }

}
