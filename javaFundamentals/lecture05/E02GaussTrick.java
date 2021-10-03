package lecture05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // 11 12 13 14 15 16 => сумата на 1вото и последното число при събиране е равна на сумата
        // от 2рото и предпоследното и т.н -> това е трикът на Гаус
        int halfSize = numbers.size() / 2;
        for (int i = 0; i <halfSize ; i++) {
            int sum = numbers.get(i) + numbers.get(numbers.size() - 1);
            numbers.set(i,sum);
            numbers.remove(numbers.size() - 1);

            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
        }
    }
}
