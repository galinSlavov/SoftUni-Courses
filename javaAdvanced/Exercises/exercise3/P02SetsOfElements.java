package exercise3;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        String input = scanner.nextLine();
        int countFirstSet = Integer.parseInt(input.split("\\s+")[0]);
        int countSecondSet = Integer.parseInt(input.split("\\s+")[1]);

         //1.fill two sets
        for (int i = 0; i < countFirstSet; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }
        for (int i = 0; i < countSecondSet; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }
        //2.take elements who are repeated in two sets
        //2.1way to take elements
        LinkedHashSet<Integer> duplicatedElements = new LinkedHashSet<>();
        for (int number: firstSet ){
            if (secondSet.contains(number)){
                duplicatedElements.add(number);
            }
        }
        //2.2 second way to take elements
        // firstSet.retainAll(secondSet);
        duplicatedElements.forEach(number -> System.out.print(number + " "));
    }
}
