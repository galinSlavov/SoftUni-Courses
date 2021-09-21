package lecture6;

import java.util.Scanner;

public class E03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int primeSum = 0;
        int nonPrimeSum = 0;
        while (!input.equals("stop")) {
            boolean isPrime = true;
            int num = Integer.parseInt(input);
             if (num < 0){
                 System.out.println("Number is negative.");
                 input = scanner.nextLine();
                 continue;
             }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                 nonPrimeSum += num;
                 isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeSum += num;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",primeSum);
        System.out.printf("Sum of all non prime numbers is: %d",nonPrimeSum);
    }
}
