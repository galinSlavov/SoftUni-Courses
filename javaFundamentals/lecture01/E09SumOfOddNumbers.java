package lecture01;

import java.util.Scanner;

public class E09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 100 ; i+=2) {

            counter++;
            sum += i;
            System.out.println(i);

            if (counter == n){
                System.out.printf("Sum: %d",sum);
                return;
            }
        }

    }
}
