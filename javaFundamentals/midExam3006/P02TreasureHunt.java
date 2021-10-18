package midExam3006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String treasureChestContent = scanner.nextLine();
        //razdelqe na spisyka chez |
        String[] splitChest = treasureChestContent.split("\\|");
        //sydyrjanie na spisyka
        List<String> chestContent = Arrays.stream(splitChest).collect(Collectors.toList());

        //chetem komandi dokato ne poluchim Yohoho kato wsqka komanda razbiwame na masiv
        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")){
            //razbiwame komandata na masiv
            String [] commandsArray = command.split(" ");
            String currentCommandName = commandsArray[0];

            switch (currentCommandName){
                case "Loot":

                    for (int i = 1; i <commandsArray.length ; i++) {
                        //ako ne go sudurja shte go dobawi na 0leva poziciq
                        if (!chestContent.contains(commandsArray[i])){
                            //Add
                            chestContent.add(0,commandsArray[i]);
                        }
                    }
                    break;

                case "Drop":

                    int dropIndex = Integer.parseInt(commandsArray[1]);
                    if (dropIndex < 0 || dropIndex >= chestContent.size()){
                        break;
                    }
                    //premahwame elementa na syotwetniq indeks i go dobawqme nakraq
                    String itemToDrop = chestContent.remove(dropIndex);
                    //add metoda dobawq elementite avtomatichno w kraq
                    chestContent.add(itemToDrop);
                    break;

                case "Steal":

                    //zapochwame ot 1 zashtoto na 0 poziciq e komandata Steal
                    int stealAmount = Integer.parseInt(commandsArray[1]);
                    //trqbwa da premahnem elementite kojto sa ni zadadeni broi(2,3,5) i gi dobawqme w nowiq spisyk
                    List<String> stolenItems = new ArrayList<>();
                    String output = "";
                    if (stealAmount >= chestContent.size()){
                      output = String.join(", ",chestContent);
                        System.out.println(output);
                        //premahwa elementite ot spisyka
                        chestContent.clear();
                        break;
                    }else {
                        for (int i = 0; i < stealAmount; i++) {
                            int lastIndex = chestContent.size() - 1;
                            stolenItems.add(chestContent.remove(lastIndex));
                        }
                        //dobawqme v izhoda otkradnatite elementi i gi razdelqme s ,
                        output = String.join(", ",stolenItems);
                        System.out.println(output);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        int totalSizeOfLoot = 0;
        for (String currentLoot : chestContent) {
         totalSizeOfLoot += currentLoot.length();
        }
        if (totalSizeOfLoot == 0){
            System.out.println("Failed treasure hunt.");
        }else {
            double averagePrice = 1.0 * totalSizeOfLoot / chestContent.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.",averagePrice);
        }
    }
}
