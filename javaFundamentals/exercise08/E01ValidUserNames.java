package exercise08;

import java.util.Scanner;

public class E01ValidUserNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] words = input.split(", ");

        for (String word : words) {
            // proverka dali e validna
            if (isValidWord(word)) {
                System.out.println(word);
            }
        }

    }

    private static boolean isValidWord(String word) {
        boolean isValid = false;
        if (word.length() >= 3 && word.length() <= 16) {
            isValid = true;

        } else {
            return false;
        }
        for (char symol : word.toCharArray()) {
            if (Character.isLetterOrDigit(symol) || symol == '-' || symol == '_') {
                isValid = true;
            } else {
                return false;
            }
        }
        return true;
    }
}

