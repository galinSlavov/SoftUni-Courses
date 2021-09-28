package exercise02;

import java.util.Scanner;

public class E05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. да обходим всяка стойност
        //2. да вземем съответния символ

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        for (int code = startNumber; code <= endNumber; code++) {

            System.out.printf("%c ",(char)code);
        }
    }
}
