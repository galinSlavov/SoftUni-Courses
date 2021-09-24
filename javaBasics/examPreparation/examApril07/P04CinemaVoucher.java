package ExamPrep.april07;

import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucherAmount = Integer.parseInt(scanner.nextLine());
        String purchase = scanner.nextLine();
        int ticket = 0;
        int others = 0;
        while (!purchase.equals("End")) {

            //името на покупката съдържа повече от 8 символа
            if (purchase.length() > 8) {
                int ticketPrice = purchase.charAt(0) + purchase.charAt(1);
                voucherAmount -= ticketPrice;
                if (voucherAmount < 0) {
                    break;
                }
                ticket++;
            } else {
                int price = purchase.charAt(0);
                voucherAmount -= price;
                if (voucherAmount < 0) {
                    break;
                }
                others++;
            }
            purchase = scanner.nextLine();
        }
        System.out.println(ticket);
        System.out.println(others);
    }
}
