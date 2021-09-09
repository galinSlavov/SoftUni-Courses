package lecture2;

import java.util.Scanner;

public class AreaOfFiguresCopy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String figure = scan.nextLine();

        if(figure.equalsIgnoreCase("square")){
            double a = Double.parseDouble(scan.nextLine());
            double area = a * a;
            System.out.printf("%.3f", area);
        }
        else if (figure.equalsIgnoreCase("rectangle")){
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            double area = a * b;
            System.out.printf("%.3f", area);
        }
        else if (figure.equalsIgnoreCase("circle")){
            double r = Double.parseDouble(scan.nextLine());
            double area = Math.PI * r * r;
            System.out.printf("%.3f", area);
        }
        else if (figure.equalsIgnoreCase("triangle")){
            double a = Double.parseDouble(scan.nextLine());
            double h = Double.parseDouble(scan.nextLine());
            double area = a * h / 2;
            System.out.printf("%.3f", area);
        }
    }
}
