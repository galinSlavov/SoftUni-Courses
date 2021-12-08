package ExamPrep.april20;

import java.util.Scanner;

public class E04EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalEggsInShop = Integer.parseInt(scanner.nextLine());

        String text = scanner.nextLine();
        int buyEggs = 0;

        while (!text.equals("Close")) {
            int countEggs = Integer.parseInt(scanner.nextLine());

            if (text.equals("Buy")) {
                int eggsNow = totalEggsInShop;
                totalEggsInShop = totalEggsInShop - countEggs;
                buyEggs += countEggs;
                if (totalEggsInShop <= 0) {
                    System.out.printf("Not enough eggs in store!\nYou can buy only %d.\n", eggsNow);
                    return;
                }

            } else if (text.equals("Fill")) {
                totalEggsInShop = totalEggsInShop + countEggs;

            }

            text = scanner.nextLine();
        }
        System.out.printf("Store is closed!\n%d eggs sold.\n", buyEggs);
    }
}
