package lecture3;

import java.util.Scanner;

public class PL05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (product.equals("coffee")) {
            if (town.equals("Sofia")) {
                System.out.println(quantity * 0.50);
            } else if (town.equals("Plovdiv")) {
                System.out.println(quantity * 0.40);
            } else if (town.equals("Varna")) {
                System.out.println(quantity * 0.45);
            }
        } else if (product.equals("water")) {
            if (town.equals("Sofia")) {
                System.out.println(quantity * 0.80);
            } else if (town.equals("Plovdiv")) {
                System.out.println(quantity * 0.70);
            } else if (town.equals("Varna")) {
                System.out.println(quantity * 0.70);
            }
        } else if (product.equals("beer")) {
            if (town.equals("Sofia")) {
                System.out.println(quantity * 1.20);
            } else if (town.equals("Plovdiv")) {
                System.out.println(quantity * 1.15);
            } else if (town.equals("Varna")) {
                System.out.println(quantity * 1.10);
            }
        } else if (product.equals("sweets")) {
            if (town.equals("Sofia")) {
                System.out.println(quantity * 1.45);
            } else if (town.equals("Plovdiv")) {
                System.out.println(quantity * 1.30);
            } else if (town.equals("Varna")) {
                System.out.println(quantity * 1.35);
            }
        } else if (product.equals("peanuts")) {
            if (town.equals("Sofia")) {
                System.out.println(quantity * 1.60);
            } else if (town.equals("Plovdiv")) {
                System.out.println(quantity * 1.50);
            } else if (town.equals("Varna")) {
                System.out.println(quantity * 1.55);
            }
        }
    }
}