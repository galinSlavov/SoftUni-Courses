package lecture5.moreexercises;

import java.util.Scanner;

public class E06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double electricityTotal = 0;
        double waterTotal = 0;
        double internetTotal = 0;
        double othersTotal = 0;
        double averageBills = 0;
        for (int i = 1; i <= months ; i++) {
            double electricityPerMonth = Double.parseDouble(scanner.nextLine());

            electricityTotal = electricityTotal + electricityPerMonth;
            waterTotal = waterTotal + 20;
            internetTotal = internetTotal + 15;
            othersTotal = othersTotal + (electricityPerMonth + 20 + 15) + (electricityPerMonth + 20 + 15) * 0.20;
        }
        averageBills = (electricityTotal + waterTotal + internetTotal + othersTotal) / months;

        System.out.printf("Electricity: %.2f lv\n",electricityTotal);
        System.out.printf("Water: %.2f lv\n",waterTotal);
        System.out.printf("Internet: %.2f lv\n",internetTotal);
        System.out.printf("Other: %.2f lv\n",othersTotal);
        System.out.printf("Average: %.2f lv\n",averageBills);
    }
}
