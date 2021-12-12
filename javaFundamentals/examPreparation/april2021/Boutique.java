package examPreparation.april2021;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Boutique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> tulips = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .forEach(tulips::push);


        ArrayDeque<Integer> daffodils = Arrays.stream(scan.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int leftFlowers = 0;
        int countBouquets = 0;

        while (tulips.peek() != null && daffodils.peek() != null) {

            int sumTulipsAndDaffodils = tulips.pop() + daffodils.poll();

            while (sumTulipsAndDaffodils > 15) {
                sumTulipsAndDaffodils -= 2;
            }
            if (sumTulipsAndDaffodils == 15) {
                countBouquets++;
            } else {
                leftFlowers += sumTulipsAndDaffodils;
            }
        }
        countBouquets += leftFlowers / 15;

        if (countBouquets >= 5) {
            System.out.printf("You made it! You go to the competition with %d bouquets!", countBouquets);
        } else {
            System.out.printf("You failed... You need more %d bouquets.", 5 - countBouquets);
        }
    }
}

