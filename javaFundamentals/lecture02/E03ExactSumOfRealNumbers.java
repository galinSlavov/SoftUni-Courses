package lecture02;

import java.math.BigDecimal;
import java.util.Scanner;

public class E03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           int number = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);   //BigDecimal_ZERO

        for (int i = 0; i <number ; i++) {
            BigDecimal currentNumber = new BigDecimal (scanner.nextLine());
            sum = sum.add(currentNumber);
        }
        System.out.println(sum);
    }
}
