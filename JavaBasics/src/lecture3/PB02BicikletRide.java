package lecture3;

import java.util.Scanner;

public class PB02BicikletRide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trails = scanner.nextLine();

        double juniorsPrice = 0;
        double seniorPrice = 0;
        double total = 0;
        if(trails.equals("trail")){
            juniorsPrice = juniors * 5.50;
            seniorPrice = seniors * 7.00;
            total = juniorsPrice + seniorPrice;
            total = total - (total * 0.05);

        }else if(trails.equals("cross-country")){
            juniorsPrice = juniors * 8.00;
            seniorPrice = seniors * 9.50;
            total = juniorsPrice + seniorPrice;
            total = total - (total * 0.05);
            if(juniors + seniors >= 50){
                total = total - (total * 0.25);
            }
        }else if(trails.equals("downhill")){
            juniorsPrice = juniors * 12.25;
            seniorPrice = seniors * 13.75;
            total = juniorsPrice + seniorPrice;
            total = total - (total * 0.05);
        }else if(trails.equals("road")){
            juniorsPrice = juniors * 20.00;
            seniorPrice = seniors * 21.50;
            total = juniorsPrice + seniorPrice;
            total = total - (total * 0.05);

        }
        System.out.printf("%.2f",total);
    }
}
