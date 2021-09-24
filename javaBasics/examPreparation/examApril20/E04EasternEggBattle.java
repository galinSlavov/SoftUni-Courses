package ExamPrep.april20;

import java.util.Scanner;

public class E04EasternEggBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Брой яйца, които има първият играч - цяло число в интервала [1 … 99]
        //2.	Брой яйца, които има вторият играч - цяло число в интервала [1 … 99]
        //След това до получаване на команда "End of battle" се  многократно един ред:
        //3.	Победител - текст - "one" или

        int eggsPlayerOne = Integer.parseInt(scanner.nextLine());
        int eggsPlayerTwo = Integer.parseInt(scanner.nextLine());
        String winner = scanner.nextLine();

        while (!winner.equals("End of battle")){
            if (winner.equals("one")){
                eggsPlayerTwo -= 1;

            }else if (winner.equals("two")){
                eggsPlayerOne -= 1;
            }
            if (eggsPlayerOne == 0){
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.\n",eggsPlayerTwo);
                return;
            }else if (eggsPlayerTwo == 0){
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.\n",eggsPlayerOne);
                return;
            }

            winner = scanner.nextLine();
        }
        System.out.printf("Player one has %d eggs left.\n",eggsPlayerOne);
        System.out.printf("Player two has %d eggs left.\n",eggsPlayerTwo);
    }
}
