package examPreparation.august2021;

import java.util.*;
import java.util.stream.Collectors;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //We make Queue because we need first element (FIFO)
        ArrayDeque<Integer> liquids = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));  //add()
        //We make Stack because we need last element (LIFO)
        ArrayDeque<Integer> ingredients = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(ingredients::push);

        Map<Integer, String> cookingTable = new HashMap<>();
        cookingTable.put(25, "Biscuit");
        cookingTable.put(50, "Cake");
        cookingTable.put(75, "Pastry");
        cookingTable.put(100, "Pie");

        Map<String, Integer> productsCooked = new TreeMap<>();

        cookingTable.values()
                .forEach(p -> productsCooked.put(p, 0));

        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            int currentLiquid = liquids.poll();
            int currentIngredient = ingredients.pop();

            int sum = currentLiquid + currentIngredient;
            if (ableToCookProduct(sum)) {
                String product = cookingTable.get(sum);
                productsCooked.put(product, productsCooked.get(product) + 1);

            } else {
                ingredients.push(currentIngredient + 3);
            }

        }

        if (hasCoockedEachMeal(productsCooked)) {

            System.out.println("Great! You succeeded in cooking all the food!");
        } else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }

        System.out.println("Liquids left: " + getElementsInfo(liquids));
        System.out.println("Ingredients left: " + getElementsInfo(ingredients));

        productsCooked.forEach((k,v) -> {
            System.out.println(k + ": " + v);
        });

    }

    private static String getElementsInfo(ArrayDeque<Integer> deque) {
        return  deque.isEmpty()
                ? "none"
                : deque.stream()
                .map(String :: valueOf)
                .collect(Collectors.joining(", "));
    }

    private static boolean hasCoockedEachMeal(Map<String, Integer> productsCooked) {
        return productsCooked.values()
                .stream()
                .noneMatch(c -> c == 0);
    }

    private static boolean ableToCookProduct(int sum) {
        return sum == 25 || sum == 50 || sum == 75 || sum == 100;
    }
}
