package exercise02;

import java.util.Scanner;

public class E01Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int fourthNum = Integer.parseInt(scanner.nextLine());

        int total = ((firstNum + secondNum)/thirdNum) * fourthNum;

        System.out.println(total);
    }
}
