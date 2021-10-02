package exercise04;

import java.util.Scanner;

public class E05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int result = sum(n1,n2);
        sum(n1,n2);
        subtract(result,n3);
        System.out.println(subtract(result,n3));
    }

    private static int subtract(int result, int n3) {
        int results = result - n3;
        return results;

    }

    private static int sum(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
}
