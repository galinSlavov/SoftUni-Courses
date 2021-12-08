package ExamPrep.may03;

import java.util.Scanner;

public class E04TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първи ред – бюджетът - реално число в интервала [1.00… 100000.00]
        //•	След това поредица от два реда (до получаване на команда "Stop" или при заявка за купуване на продукт, чиято стойност е по-висока от наличния бюджет) :
        //Име на продукта – текст
        //Цена на продукта – реално число в интервала [1.00… 5000.00]

        double budget = Double.parseDouble(scanner.nextLine());


        int boughtProducts = 0;
        int numberOfProduct = 0;
        double totalPriceForProduct = 0;
        while (true){
            double priceForProduct = Double.parseDouble(scanner.nextLine());
            String nameOfProduct = scanner.nextLine();


            if (nameOfProduct.equals("Stop")){
                System.out.printf("You bought %d products for %.2f leva.%n",boughtProducts,totalPriceForProduct);
                break;
            }else {
                priceForProduct = Double.parseDouble(scanner.nextLine());
                numberOfProduct++;
            }

            if (numberOfProduct % 3 == 0){
                priceForProduct *= 0.50;
            }

            if (priceForProduct > budget){
                System.out.printf("You don't have enough money!%n" +
                        "You need %.2f leva!%n",Math.abs(budget - priceForProduct));
                break;
            }

            budget = budget - priceForProduct;
            totalPriceForProduct +=priceForProduct;

            boughtProducts++;
        }
    }
}
