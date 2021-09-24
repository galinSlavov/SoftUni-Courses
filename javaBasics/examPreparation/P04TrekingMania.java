package examPrepOfficial;

import java.util.Scanner;

public class P04TrekingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int sumMusala = 0;
        int sumMontblanc = 0;
        int sumKilimanjaro = 0;
        int sumK2 = 0;
        int sumEverest = 0;
        int totalPeople = 0;
        for (int i = 1; i <= groups; i++) {
            int peopleSingleGroup = Integer.parseInt(scanner.nextLine());

            if (peopleSingleGroup <= 5){
              sumMusala = sumMusala + peopleSingleGroup;
            }else if(peopleSingleGroup <= 12){
               sumMontblanc = sumMontblanc + peopleSingleGroup;
            }else if(peopleSingleGroup <= 25){
                sumKilimanjaro = sumKilimanjaro + peopleSingleGroup;
            }else if (peopleSingleGroup <= 40){
                sumK2 = sumK2 + peopleSingleGroup;
            }else {
                sumEverest = sumEverest + peopleSingleGroup;
            }

            totalPeople = totalPeople + peopleSingleGroup;
        }
        System.out.printf("%.2f%%\n",sumMusala * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%\n",sumMontblanc * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%\n",sumKilimanjaro * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%\n",sumK2 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%",sumEverest * 1.0 / totalPeople * 100);
    }
}
