package lecture08;

import java.util.Scanner;

public class E01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        while (!"end".equals(line)) {
            String reversed = "";
            for (int i = line.length() - 1; i >= 0; i--) {
                reversed += line.charAt(i);

            }
            System.out.printf("%s = %s%n", line, reversed);
            line = scanner.nextLine();
        }
    }
}
