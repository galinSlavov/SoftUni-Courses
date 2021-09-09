package lecture2;

import java.util.Scanner;

public class E01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int allTime = first + second + third;

        int minutes = allTime / 60;
        int seconds = allTime % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        }else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
