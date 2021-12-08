package lecture2;

import java.util.Scanner;

public class PB06Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – брой дни – цяло число в интервал [1…5000]
        //•	Втори ред – оставена храна в килограми – цяло число в интервал [0…100000]
        //•	Трети ред – храна на ден за кучето в килограми – реално число в интервал [0.00…100.00]
        //•	Четвърти ред – храна на ден за котката в килограми– реално число в интервал [0.00…100.00]
        //•	Пети ред – храна на ден за костенурката в грамове – реално число в интервал [0.00…10000.00]

        int days = Integer.parseInt(scanner.nextLine());
        int totalFood = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDay = Double.parseDouble(scanner.nextLine());
        double catFoodPerDay = Double.parseDouble(scanner.nextLine());
        double turFoodPerDay = Double.parseDouble(scanner.nextLine());

        double dogNeeded = dogFoodPerDay * days;
        double catNeeded = catFoodPerDay * days;
        double turNeeded = (turFoodPerDay * days) / 1000;

        double totalNeeded = dogNeeded + catNeeded + turNeeded;
        double result = 0;
        if (totalNeeded < totalFood){
            result = totalFood - totalNeeded;
            System.out.printf("%.0f kilos of food left.",Math.floor(result));
        }else {
            result = totalNeeded - totalFood;
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(result));
        }
    }
}
