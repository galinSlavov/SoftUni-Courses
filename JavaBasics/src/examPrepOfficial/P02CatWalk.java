package examPrepOfficial;

import java.util.Scanner;

public class P02CatWalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//•	На първия ред - минути разходка на ден - цяло число в интервала [1...50]
//•	На втория ред - броят на разходките дневно - цяло число в интервала [1…10]
//•	На третия ред - приетите от котката калории на ден – цяло число в интервала [100…4000]
        int minutesPerWalk = Integer.parseInt(scanner.nextLine());
        int countWalkPerDay =  Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int totalMinutesWalk = minutesPerWalk * countWalkPerDay;
        int caloriesBurn = totalMinutesWalk * 5;

        double halfCalories = calories * 0.50;

        if (caloriesBurn >= halfCalories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",caloriesBurn);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",caloriesBurn);
        }

    }
}
