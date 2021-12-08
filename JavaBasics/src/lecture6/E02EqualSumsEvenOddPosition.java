package lecture6;

import java.util.Scanner;

public class E02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2; i++) {
            int evenSum = 0;
            int oddSum = 0;
            int currentNum = i;
            for (int pos = 6; pos >= 1; pos--) {

                // vzemam poslednata cifra
                int digit = currentNum % 10;
                //premahwam poslednata cifra
                currentNum /= 10;
                if (pos % 2 == 0){
                    evenSum +=digit;
                }else   {
                    oddSum += digit;
                }
            }
           //proverka dali sumite na chetni i nechetni pozicii sa ravni
            if (evenSum == oddSum){
                System.out.print(i + " ");
            }
        }
    }
}
