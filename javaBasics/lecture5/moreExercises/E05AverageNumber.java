package lecture5.moreexercises;

import java.util.Scanner;

public class E05AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int n = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            counter++;
            sum +=currentNum;
        }
        System.out.printf("%.2f",sum / counter );
    }
}
