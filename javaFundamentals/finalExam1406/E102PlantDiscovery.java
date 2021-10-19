package finalExam1406;

import java.util.*;

public class E102PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Plant
        //name -> rose
        //rarity -> 12 if change we have to change with new one
        //ratings -> 8, 9, 4, 11

        //1.read n number of plants/rarity
        //replace rarity of existing rarity

        //3 commands
           //rate - give rating to plant
           //update - update plants rarity
           //reset - remove all rating of plants

        //calculate average rating of a plant
        //sort by 2 criteria and print
        int plantNumber = Integer.parseInt(scanner.nextLine());
        Map<String, PlantData> currentPlants = new LinkedHashMap<>();

        for (int i = 0; i < plantNumber; i++) {
            String plantText = scanner.nextLine();
            String[] plantParts = plantText.split("<->");
            String plantName = plantParts[0];
            int plantRarity = Integer.parseInt(plantParts[1]);
            PlantData newPlant = new PlantData(new ArrayList<>(), plantRarity);
            currentPlants.put(plantName,newPlant);
        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")){
            String[] commandParts = command.split(": | - ");
            String commandName = commandParts[0];
            String plantName = commandParts[1];

            if (!currentPlants.containsKey(plantName)){
                command = scanner.nextLine();
                System.out.println("error");
                continue;
            }

            switch (commandName){
                case "Rate":
                    int rating = Integer.parseInt(commandParts[2]);
                    currentPlants.get(plantName).addRatings(rating);
                    break;
                case "Update":
                    int rarity = Integer.parseInt(commandParts[2]);
                    currentPlants.get(plantName).setRarity(rarity);
                    break;
                case "Reset":
                    currentPlants.get(plantName).removeAllRatings();
                    break;
                default:
                    System.out.println("error");
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        currentPlants.entrySet().stream().sorted((p1,p2) -> {
            //Integer.compare // p1, p2 -> p2,p1
            //Double.compare

            int result = Integer.compare(p2.getValue().getRarity(), p1.getValue().getRarity());
            if (result == 0){
                result = Double.compare(p2.getValue().getAverageRating(),p1.getValue().getAverageRating());
            }
            return result;

        }).forEach(p -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                p.getKey(),
                p.getValue().getRarity(),
                p.getValue().getAverageRating()));
    }
}
class PlantData{
    private List<Integer> ratings;
    private int rarity;

    public void removeAllRatings(){
        this.ratings.clear();
    }

    public void addRatings(int rating){
        this.ratings.add(rating);
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getRarity() {
        return rarity;
    }

    public double getAverageRating(){
        double sumOfAllRatings = 0;
        for (Integer rating : this.ratings){
            sumOfAllRatings += rating;
        }
        if (sumOfAllRatings == 0){
            return 0;
        }else {
            return sumOfAllRatings / this.ratings.size();
        }
    }

    public PlantData(List<Integer> ratings, int rarity){
        this.rarity = rarity;
        this.ratings = ratings;
    }
}