package exercise04;

import java.util.Locale;
import java.util.Scanner;

public class E02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();

        printCountVowels(text);
    }
      //print count of vowels in string
    private static void printCountVowels(String text) {
        //1 да обхожда моя текс(взема всички символи)
        //2 проверява дали символа е с гласна буква ->увеличава броя с 2
        //3 принтирам броя на гласните
        int count = 0;   //броя на гласните букви
        for (int index = 0; index <= text.length() - 1; index++) {
            char currentSymbol = text.charAt(index);
            switch (currentSymbol){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }
}
