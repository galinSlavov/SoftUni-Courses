package exercise02;

import java.util.Scanner;

public class E09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
         // всеки ден -> добив - 26
        int days = 0; // общ брой дни
        int totalAmount = 0; // общ брой подправки
        while (yield >= 100){
            int workedSpiced = yield - 26;
            totalAmount += workedSpiced;
            yield -= 10;
            days++;
        }
        System.out.println(days);
        //ако има подправки вземат 26 ако ли не, не вземат
        if (totalAmount >= 26){
            totalAmount -= 26;
        }
        System.out.println(totalAmount);
    }
}
