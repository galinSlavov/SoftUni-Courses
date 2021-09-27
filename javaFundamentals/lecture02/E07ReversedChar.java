package lecture02;

import java.util.Scanner;

public class E07ReversedChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstDigit = scanner.nextLine().charAt(0);
        char secondDigit = scanner.nextLine().charAt(0);
        char thirdDigit = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c",thirdDigit,secondDigit,firstDigit);
    }
}
