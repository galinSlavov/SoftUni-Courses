package lecture5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> evenNumbers = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        //1. first way without Function
//        String firstOutput = evenNumbers
//                .stream()
//                .map(String::valueOf)
//                .collect(Collectors.joining(", "));
//
//        System.out.println(firstOutput);
//
//        String secondOutput = evenNumbers
//                .stream()
//                .sorted()
//                .map(String::valueOf)
//                .collect(Collectors.joining(", "));
//
//        System.out.println(secondOutput);

        //2.Second way with Function
        //We make function with data which is repeated
        Function<Stream<Integer>, String> mutator = x -> x.map(String::valueOf)
                .collect(Collectors.joining(", "));

        //mutator.apply call the function
        String firstOutput = mutator.apply(evenNumbers.stream());
        System.out.println(firstOutput);
        String secondOutput = mutator.apply(evenNumbers.stream().sorted());
        System.out.println(secondOutput);
    }
}
