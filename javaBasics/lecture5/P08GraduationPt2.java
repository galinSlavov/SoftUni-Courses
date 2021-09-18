package lecture5;

import java.util.Scanner;

public class P08GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double sum = 0;
        int excluded = 0;
        int count = 1;
        while (count <= 12) {
            if (excluded > 1) {
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4.0) {
                excluded++;
                continue;
            }

            sum += grade;
            count++;

        }
        if (excluded > 1) {
            System.out.printf("%s has been excluded at %d grade", name, count);

        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
        }

    }
}
