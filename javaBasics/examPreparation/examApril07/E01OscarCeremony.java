package ExamPrep.april07;

import java.util.Scanner;

public class E01OscarCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Статуетки  – цената им е 30% по-малка от наема на залата
        //•	Кетъринг – цената му е 15% по-малка от тази на статуетките
        //•	Озвучаване – цената му е 1 / 2 от цената за кетъринг

        int rentForHall = Integer.parseInt(scanner.nextLine());

       double statues = rentForHall - (rentForHall  * 0.30);
       double catering = statues - (statues * 0.15);
       double sound = catering * 0.50;

       double totalPrice = rentForHall + statues + catering + sound;

        System.out.printf("%.2f",totalPrice);

    }
}
