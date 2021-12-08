package ExamPrep;

import java.util.Scanner;

public class E03WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//1.	Етап на първенството – текст - “Quarter final ”, “Semi final” или “Final”
//2.	Вид на билета – текст - “Standard”, “Premium” или “VIP”
//3.	Брой билети – цяло число в интервала [1 … 30]
//4.	Снимка с трофея – символ – 'Y' (да) или 'N' (не)
        //55.50 £/бр.	75.88 £/бр.	110.10 £/бр.
        //105.20 £/бр.	125.22 £/бр.	160.66 £/бр.
        //118.90 £/бр.	300.40 £/бр.	400 £/бр.
        String stage = scanner.nextLine();
        String ticket = scanner.nextLine();
        int ticketCount = Integer.parseInt(scanner.nextLine());
        String photo = scanner.nextLine();
        boolean isValid = true;

        double totalPrice = 0;
        double plusTicket = 0;
        double totalPlusTicket = 0;
        if (stage.equals("Quarter final")) {
            if (ticket.equals("Standard")) {
                totalPrice = ticketCount * 55.50;
            } else if (ticket.equals("Premium")) {
                totalPrice = ticketCount * 105.20;
            } else if (ticket.equals("VIP")) {
                totalPrice = ticketCount * 118.90;
            }

        } else if (stage.equals("Semi final")) {
            if (ticket.equals("Standard")) {
                totalPrice = ticketCount * 75.88;
            } else if (ticket.equals("Premium")) {
                totalPrice = ticketCount * 125.22;
            } else if (ticket.equals("VIP")) {
                totalPrice = ticketCount * 300.40;
            }
        } else if (stage.equals("Final")) {
            if (ticket.equals("Standard")) {
                totalPrice = ticketCount * 110.10;
            } else if (ticket.equals("Premium")) {
                totalPrice = ticketCount * 160.66;
            } else if (ticket.equals("VIP")) {
                totalPrice = ticketCount * 400.00;
            }
        }
        if (isValid) {
            if (totalPrice > 4000) {
                totalPrice *= 0.25;

            } else if (totalPrice > 2500 && totalPrice <= 4000) {
                totalPrice *= 0.10;
                plusTicket = ticketCount * 40;
                totalPlusTicket = totalPrice + plusTicket;
                System.out.printf("%.2f", totalPlusTicket);
            }
            System.out.printf("%.2f", totalPrice);
        } else  {
            System.out.printf("%.2f", totalPrice);

        }

    }
}
