import java.util.function.*;

public class FunctionalProgramming {
    public static void main(String[] args) {

        //Function<приема, връща> = .apply
        Function<Integer, Integer> power2 = number -> number * number;
        System.out.println(power2.apply(5));

        //Consumer<приема стойност> -> void -> .accept
        Consumer<String > printWord = word -> System.out.println(word);
        printWord.accept("Ivan");

        //Supplier<връща стойност> -> .get
        Supplier<Integer> date = () -> 30;
        System.out.println(date.get());

        //Predicate<приема(проверява и връща true or false)> -> .test
        Predicate<String> isEquals = word -> word.equals("Test");
        System.out.println(isEquals.test("Ivan")); // false
        System.out.println(isEquals.test("Test")); // true

        //BiFunction<приема 2 параметъра и връща 1 (Integer,Integer,String)> -> .apply
        BiFunction <Integer, Integer, String> sum = (number1, number2) -> String.valueOf(number1 + number2);
        System.out.println(sum.apply(5,6));
    }
}
