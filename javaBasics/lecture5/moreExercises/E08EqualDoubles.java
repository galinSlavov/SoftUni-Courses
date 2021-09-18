package lecture5.moreexercises;

import java.util.Scanner;

public class E08EqualDoubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        double diff = 0;
        double maxDiff = 0;
        for (int i = 0; i < n; i++) {

          double num1 = Double.parseDouble(scanner.nextLine());
          double num2 = Double.parseDouble(scanner.nextLine());
          double currentSum = num1 + num2;
          if (i == 0){
              sum = currentSum;
          }else{
              diff = Math.abs(sum - currentSum);
              sum = currentSum;
          }
          if (diff > maxDiff){
              maxDiff = diff;
          }
        }
        if (maxDiff == 0){
            System.out.printf("Yes, value=%.0f",sum);
        }else {
            System.out.printf("No, maxdiff=%.0f",maxDiff);
        }
    }
}
