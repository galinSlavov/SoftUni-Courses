package lecture02;

import java.util.Scanner;

public class E06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letterOne = scanner.nextLine().charAt(0);
        char letterTwo = scanner.nextLine().charAt(0);
        char letterTree = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c",letterOne,letterTwo,letterTree);
    }
}
