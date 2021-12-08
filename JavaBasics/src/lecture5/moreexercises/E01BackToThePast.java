package lecture5.moreexercises;

import java.util.Scanner;

public class E01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ownedMoney = Double.parseDouble(scanner.nextLine());
        int yearHeWillLive = Integer.parseInt(scanner.nextLine());

        int countYears = 0;
        for (int i = 1800; i <= yearHeWillLive; i++) {

            if (i % 2 == 0){
                ownedMoney = ownedMoney - 12000;
            }else {
                ownedMoney = ownedMoney - (12000 + (50 * (18 + countYears)));
            }
            countYears ++;
        }
        if (ownedMoney >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",ownedMoney );
        }else {
            System.out.printf("He will need %.2f dollars to survive.",Math.abs(ownedMoney) );
        }
    }
}
