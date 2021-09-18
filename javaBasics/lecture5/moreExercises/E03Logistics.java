package lecture5.moreexercises;


import java.util.Scanner;

public class E03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDriveLuggage = Integer.parseInt(scanner.nextLine());

        int totalPerBuss = 0;
        int totalPerTruck = 0;
        int totalPerTrain = 0;
        int totalLuggage = 0;
        int totalLuggageBuss = 0;
        int totalLuggageTruck = 0;
        int totalLuggageTrain = 0;

        for (int i = 1; i <= countDriveLuggage; i++) {
            int luggagePerT = Integer.parseInt(scanner.nextLine());

            if (luggagePerT <= 3) {
                totalPerBuss = totalPerBuss + 200 * luggagePerT;
                totalLuggageBuss +=luggagePerT;
                totalLuggage += luggagePerT;
            } else if (luggagePerT >= 4 && luggagePerT <= 11) {
                totalPerTruck = totalPerTruck + 175 * luggagePerT;
                totalLuggageTruck +=luggagePerT;
                totalLuggage += luggagePerT;
            } else if (luggagePerT >= 12) {
                totalPerTrain = totalPerTrain + 120 * luggagePerT;
                totalLuggageTrain +=luggagePerT;
                totalLuggage += luggagePerT;

            }
        }

        System.out.printf("%.2f\n", (1.0 * totalPerBuss + totalPerTrain + totalPerTruck) / totalLuggage);
        System.out.printf("%.2f%%\n", (1.0 * totalLuggageBuss / totalLuggage) * 100.00);
        System.out.printf("%.2f%%\n", (1.0 * totalLuggageTruck/ totalLuggage) * 100.00);
        System.out.printf("%.2f%%\n", (1.0 * totalLuggageTrain / totalLuggage) * 100.00);
    }
}
