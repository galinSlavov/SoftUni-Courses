package Exercise01WorkingWithAbstraction.PointInRectangle;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = readArray(scanner);

        Exercise01WorkingWithAbstraction.PointInRectangle.Point pointA = new Exercise01WorkingWithAbstraction.PointInRectangle.Point(coordinates[0], coordinates[1]);
        Exercise01WorkingWithAbstraction.PointInRectangle.Point pointC = new Exercise01WorkingWithAbstraction.PointInRectangle.Point(coordinates[2], coordinates[3]);

        Exercise01WorkingWithAbstraction.PointInRectangle.Rectangle rectangle = new Exercise01WorkingWithAbstraction.PointInRectangle.Rectangle(pointA, pointC);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            int[] tokens = readArray(scanner);

            Exercise01WorkingWithAbstraction.PointInRectangle.Point p = new Exercise01WorkingWithAbstraction.PointInRectangle.Point(tokens[0], tokens[1]);

            boolean isInside = rectangle.isInside(p);

            System.out.println(isInside);
        }
    }

    public static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
