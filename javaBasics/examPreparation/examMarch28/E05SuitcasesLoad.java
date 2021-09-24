package ExamPrep.march28;

import java.util.Scanner;

public class E05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String volumeCase = scanner.nextLine();

        double countCase = 0;

        while (!volumeCase.equals("End")){
            double volume = Double.parseDouble(volumeCase);


            if ((countCase + 1) % 3 == 0){
              volume = volume + volume * 0.10;
            }

            if (capacity < volume){
                System.out.println("No more space!");
                break;
            }
            capacity = capacity - volume;
            volumeCase = scanner.nextLine();
            countCase++;
            if (volumeCase.equals("End")){
                System.out.println("Congratulations! All suitcases are loaded!");
            }
        }

        System.out.printf("Statistic: %.0f suitcases loaded.",countCase);
    }
}
