package lecture2;

import java.util.Scanner;

public class E05Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int total = minutes + hours * 60;
        int total15 = total + 15;

        int h = total15 / 60;
        int m = total15 % 60;

        if (h > 23) {
            h = 0;
        }
        System.out.printf("%d:%02d", h, m);
    }


}

