package exercise08;

import java.math.BigInteger;
import java.util.Scanner;

public class E05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumberStr = scanner.nextLine();
        String secondNumberStr = scanner.nextLine();
        BigInteger firstNumber = new BigInteger(firstNumberStr);
        BigInteger secondNumber = new BigInteger(secondNumberStr);

//        System.out.println(firstNumber.add(secondNumber)); // събиране с бигИнтигер се прави не със знаци а команди
//        System.out.println(firstNumber.subtract(secondNumber)); // изваждане
//        System.out.println(firstNumber.divide(secondNumber)); // деление
        System.out.println(firstNumber.multiply(secondNumber)); // умножение
     }
}
