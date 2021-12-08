package ExamPrep.march28;

import java.util.Scanner;

public class E05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int buyFoodKG = Integer.parseInt(scanner.nextLine());

       String  eatenFood = scanner.nextLine();
       int totalEatenFood = 0;
       while (!eatenFood.equals("Adopted")){
            int dogEatenFood = Integer.parseInt(eatenFood);
             totalEatenFood = totalEatenFood + dogEatenFood;


           eatenFood = scanner.nextLine();
       }
       int buyFoodGr = buyFoodKG * 1000;
       if (buyFoodGr >= totalEatenFood){
           System.out.printf("Food is enough! Leftovers: %d grams.",buyFoodGr - totalEatenFood);
       }else {
           System.out.printf("Food is not enough. You need %d grams more.",Math.abs(buyFoodGr - totalEatenFood) );
       }
    }
}
