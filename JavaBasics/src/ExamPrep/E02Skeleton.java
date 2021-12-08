package ExamPrep;

import java.util.Scanner;

public class E02Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlMinutes = Integer.parseInt(scanner.nextLine());
        int controlSecunds = Integer.parseInt(scanner.nextLine());
        double weightMetres = Double.parseDouble(scanner.nextLine());
        int secFor100M = Integer.parseInt(scanner.nextLine());

        double totalTime = (controlMinutes * 60) + controlSecunds;
        double delay = weightMetres / 120;
        double totalDelay = delay * 2.5;
        double marinTime = (weightMetres / 100) * secFor100M - totalDelay;

        if (marinTime <= totalTime){
            System.out.printf("Marin Bangiev won an Olympic quota!\nHis time is %.3f.",marinTime);
        }else{
            System.out.printf("No, Marin failed! He was %.3f second slower.",Math.abs(totalTime - marinTime));
        }
    }
}
