package ExamPrep.may03;

import java.util.Scanner;

public class E06VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());

        double totalSumForPay = 0;

        for (int i = 1; i <= days; i++) {
            double hourCharge = 0;
            double dayCharge = 0;

            for (int j = 1; j <= hoursPerDay ; j++) {

                if (i % 2 == 0 && j % 2 != 0){
                    hourCharge = 2.50;
                }else if (i % 2 != 0 && j % 2 == 0){
                    hourCharge = 1.25;
                }else {
                    hourCharge = 1.00 ;
                }
               totalSumForPay += hourCharge;
                dayCharge += hourCharge;
            }

            System.out.printf("Day: %d - %.2f leva\n",i,dayCharge);
        }
        System.out.printf("Total: %.2f leva",totalSumForPay);
    }
}
