package ExamPrep;

import java.util.Scanner;

public class E05FitnessCenter {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //От конзолата се чете число, след това поредица от низове, всяко на отделен ред:
        //•	На първия ред – броят на посетителите във фитнеса – цяло число в интервала [1...1000]
        //•	За всеки един посетител на отделен ред – дейността във фитнеса – текст ("Back", "Chest", "Legs", "Abs", "Protein shake" или "Protein bar")
        
        int countPersons = Integer.parseInt(scanner.nextLine());

        int backTraining = 0;
        int chestTraining = 0;
        int legTraining = 0;
        int absTraining = 0;
        int proteinShake = 0;
        int proteinBar = 0;
        for (int i = 1; i <= countPersons ; i++) {
            String workout = scanner.nextLine();

            if (workout.equals("Back")){
                backTraining++;

            }else if(workout.equals("Chest")){
                chestTraining++;

            }else if (workout.equals("Legs")){
                legTraining++;

            }else if (workout.equals("Abs")){
                absTraining++;

            }else if (workout.equals("Protein shake")){

                proteinShake++;

            }else if (workout.equals("Protein bar")){
                proteinBar++;

            }

        }
        int total = backTraining + chestTraining + absTraining + legTraining + proteinBar + proteinShake;
        int countPeopleWorkout = backTraining + chestTraining + legTraining + absTraining;
        int countPeopleProduct = proteinBar + proteinShake;

        System.out.printf("%d - back%n",backTraining);
        System.out.printf("%d - chest%n",chestTraining);
        System.out.printf("%d - legs%n",legTraining);
        System.out.printf("%d - abs%n",absTraining);
        System.out.printf("%d - protein shake%n",proteinShake);
        System.out.printf("%d - protein bar%n",proteinBar);

        System.out.printf("%.2f%% - work out%n",countPeopleWorkout * 1.0/total * 100);
        System.out.printf("%.2f%% - protein%n",countPeopleProduct * 1.0/total * 100);

    }
}
