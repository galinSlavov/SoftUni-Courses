package lecture5.moreexercises;

import java.util.Scanner;

public class E02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        int totalPatienceCheck = 0;
        int totalPatienceUncheck = 0;
        int doctors = 7;
        for (int i = 1; i <=days ; i++) {

            if(i % 3 == 0 && totalPatienceCheck < totalPatienceUncheck){
                doctors += 1;

            }
            int patience = Integer.parseInt(scanner.nextLine());
            if (patience <= doctors){
                totalPatienceCheck = totalPatienceCheck + patience;
            }else {
                totalPatienceUncheck =totalPatienceUncheck + patience - doctors;
                totalPatienceCheck = totalPatienceCheck + doctors;
            }

        }
        System.out.printf("Treated patients: %d.\n",totalPatienceCheck);
        System.out.printf("Untreated patients: %d.",totalPatienceUncheck);
    }
}
