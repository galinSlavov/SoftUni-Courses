package exercise05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] bombAndPower = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int bomb = bombAndPower[0];
        int power = bombAndPower[1];
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) == bomb) {
                int indexOfBomb = i;
                numbers.set(indexOfBomb, minimum);

                for (int j = 0; j < power; j++) {
                    if (indexOfBomb - 1 - j >= 0) {
                        numbers.set(indexOfBomb - 1 - j, minimum);
                    }
                    if (indexOfBomb + 1 + j <= numbers.size() - 1) {
                        numbers.set(indexOfBomb + 1 + j, minimum);
                    }
                }
            }
        }
        numbers.removeIf(e -> e == minimum);

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }
}
