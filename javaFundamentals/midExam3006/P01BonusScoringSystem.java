package midExam3006;

import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = Integer.parseInt(scanner.nextLine());
        int lectureCount = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        double maxAttendance = 0;

        for (int i = 0; i < studentCount; i++) {
            int studentAttendance = Integer.parseInt(scanner.nextLine());
            double totalBonus = 1.0 * studentAttendance / lectureCount * (5 + additionalBonus);

            if (totalBonus > maxBonus){
                maxBonus = totalBonus;
                maxAttendance = studentAttendance;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n",maxBonus);
        System.out.printf("The student has attended %.0f lectures.",maxAttendance);
    }
}
