package ExamPrep.july07;

import java.util.Scanner;

public class E06TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        double maxPower = Double.NEGATIVE_INFINITY;
        String maxWord = "";
        while (!word.equals("End of words")) {
            int asciiSum = 0;
            boolean isVowel = false;
            double result = 0;
            for (int i = 0; i < word.length(); i++) {
                char symbol = word.charAt(i);
                char firstSymbol = word.charAt(0);
                if (firstSymbol == 'a' || firstSymbol == 'e' || firstSymbol == 'i' || firstSymbol == 'o' || firstSymbol == 'u' || firstSymbol == 'y' ||
                        firstSymbol == 'A' || firstSymbol == 'E' || firstSymbol == 'I' || firstSymbol == 'O' || firstSymbol == 'U' || firstSymbol == 'Y') {
                    isVowel = true;
                }
                asciiSum += symbol;
            }
            if (isVowel) {
                result = asciiSum * word.length();
            } else {
                result = Math.floor(asciiSum / word.length());
            }
           if (result > maxPower){
               maxPower = result;
               maxWord = word;
           }
            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f",maxWord, maxPower);
    }
}
