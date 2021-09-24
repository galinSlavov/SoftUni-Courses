package Exam180421;

import java.util.Scanner;

public class P06MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int singleDigitNum = 0;
        int doubleDigitNum = 0;
        int tripleDigitNum = 0;

        singleDigitNum = n % 10;
        doubleDigitNum = (n / 10) % 10;
        tripleDigitNum = n / 100;

        for (int singleD = 1; singleD <= singleDigitNum; singleD++) {
            for (int doubleD = 1; doubleD <= doubleDigitNum; doubleD++) {
                for (int tripleD = 1; tripleD <= tripleDigitNum; tripleD++) {

                    System.out.printf("%d * %d * %d = %d;%n", Math.abs(singleD), Math.abs(doubleD), Math.abs(tripleD), Math.abs(singleD * doubleD * tripleD));
                }
            }
        }
    }
}
