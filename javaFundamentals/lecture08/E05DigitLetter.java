package lecture08;

import java.util.Scanner;

public class E05DigitLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digit = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (Character.isDigit(currentSymbol)){
                digit.append(currentSymbol);
            }else if (Character.isAlphabetic(currentSymbol)){
                letters.append(currentSymbol);
            }else {
                symbols.append(currentSymbol);
            }
        }
        System.out.println(digit);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
