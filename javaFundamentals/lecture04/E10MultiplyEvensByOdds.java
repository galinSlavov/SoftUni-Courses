package lecture04;

import java.util.Scanner;

public class E10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int multiply = getMultiplyEvenAndOdds (Math.abs(input));
        System.out.println(multiply);
    }

    private static int getMultiplyEvenAndOdds(int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);
        return evenSum * oddSum;
    }

    private static int getSumOfOddDigits(int number) {
        int oddSum = 0;
        while (number > 0){
            int digit = number % 10;
            if (digit % 2 == 1){
                oddSum  += digit;
            }
            number = number / 10;
        }
        return oddSum;
    }

    private static int getSumOfEvenDigits(int number) {
        int evenSum = 0;
        while (number >0){
            int digit = number % 10;
            if (digit % 2 == 0){
              evenSum += digit;
            }
            number = number / 10;
        }
        return evenSum;
    }
}
