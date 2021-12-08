package lecture2;

import java.util.Scanner;

public class PB05Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред са необходимите часовете – цяло число в интервала [0 ... 200 000]
        //•	На втория ред са дните, с които фирмата разполага – цяло число в интервала [0 ... 20 000]
        //•	На третия ред е броят на служителите, работещи извънредно – цяло число в интервала [0 ... 200]
        int neededHours = Integer.parseInt(scanner.nextLine());
        int daysLeft = Integer.parseInt(scanner.nextLine());
        int extraWorkers = Integer.parseInt(scanner.nextLine());

        double onTraining = daysLeft -  (daysLeft * 0.10);
        double totalHours = onTraining * 8;
       double extraHours = extraWorkers * (2 * daysLeft);

       double total = Math.floor(totalHours + extraHours);
        double result = 0;
        if (total > neededHours) {
            result = total - neededHours;
            System.out.printf("Yes!%.0f hours left.",result);

        }else {
            result = neededHours - total;
            System.out.printf("Not enough time!%.0f hours needed.",result);

        }

    }
}
