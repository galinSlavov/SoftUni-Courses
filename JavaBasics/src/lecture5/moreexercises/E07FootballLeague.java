package lecture5.moreexercises;

import java.util.Scanner;

public class E07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityStadium = Integer.parseInt(scanner.nextLine());
        int totalFans = Integer.parseInt(scanner.nextLine());

        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 1; i <= totalFans ; i++) {
            String  sector = scanner.nextLine();

            if (sector.equals("A")){
             sectorA++;

            }else if (sector.equals("B")){
                sectorB++;

            }else if (sector.equals("V")){
              sectorV++;

            }else if (sector.equals("G")){
              sectorG++;

            }
        }
        System.out.printf("%.2f%%\n",(1.0 * sectorA/ totalFans) * 100);
        System.out.printf("%.2f%%\n",(1.0 * sectorB/ totalFans) * 100);
        System.out.printf("%.2f%%\n",(1.0 * sectorV/ totalFans) * 100);
        System.out.printf("%.2f%%\n",(1.0 * sectorG/ totalFans) * 100);
        System.out.printf("%.2f%%\n",(1.0 * totalFans / capacityStadium) * 100);
    }
}
