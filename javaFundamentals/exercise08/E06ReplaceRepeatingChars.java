package exercise08;

import java.util.Scanner;

public class E06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        StringBuilder newText  = new StringBuilder();
        // 1.добавям първата буква към новия текст
        //2.вземам всички други букви до края
        // проверявам дали текущата буква е различна от последната добавена
        // ако е различна я добавям в новия текст

        char firstLetter = inputText.charAt(0);
        newText.append(firstLetter);
        for (int index = 0; index < inputText.length(); index++) {
            char currentSymbol = inputText.charAt(index);
            char lastAddedSymbol = newText.charAt(newText.length() - 1);
            if (currentSymbol != lastAddedSymbol){
                newText.append(currentSymbol);
            }
        }
        System.out.println(newText);
    }
}
