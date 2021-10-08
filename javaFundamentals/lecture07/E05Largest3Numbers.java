package lecture07;

import java.util.*;
import java.util.stream.Collectors;

public class E05Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String input [] = scanner.nextLine().split(" ");
//
//        Arrays.stream(input)
//                .map(Integer::parseInt)
//                .sorted(Comparator.reverseOrder())
//                .limit(3)
//                .forEach(System.out::print);
        List<Integer> sorted = Arrays.stream(scanner.nextLine().split(" ")).map(Integer ::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());

    }
}
