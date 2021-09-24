package ExamPrep.march28;

import java.util.Scanner;

public class E06EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int customers = Integer.parseInt(scanner.nextLine());

        double averageBill = 0;
        String clientBuy = "";
        for (int i = 1; i <= customers ; i++) {

            clientBuy = scanner.nextLine();
            double totalClientBill = 0;
            int itemsPurchased = 0;
            while (!clientBuy.equals("Finish")){

                if (clientBuy.equals("basket")){
                   totalClientBill += 1.50;
                   itemsPurchased++;
                }else if (clientBuy.equals("wreath")){
                    totalClientBill += 3.80;
                    itemsPurchased++;
                }else if (clientBuy.equals("chocolate bunny")){
                    totalClientBill += 7.00;
                    itemsPurchased++;
                }


                clientBuy = scanner.nextLine();
            }

            if (itemsPurchased % 2 == 0){
                totalClientBill = totalClientBill - totalClientBill * 0.20;
            }
            System.out.printf("You purchased %d items for %.2f leva.\n",itemsPurchased,totalClientBill);
            averageBill = averageBill + totalClientBill;

        }

       System.out.printf("Average bill per client is: %.2f leva.",averageBill / customers);

    }
}
