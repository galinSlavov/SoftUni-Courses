package lecture06;

import java.math.BigInteger;
import java.util.Scanner;

public class E03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = Integer.parseInt(scanner.nextLine());

        BigInteger bigInteger = new BigInteger("1");
        for (int i = 1; i <= factorial ; i++) {
           bigInteger = bigInteger.multiply(new BigInteger("" + i));   //String.valueOf(i);
        }
        System.out.println(bigInteger);
    }
}
