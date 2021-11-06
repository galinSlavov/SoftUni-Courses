package lecture3;

import java.util.*;

public class P07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> countries = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            countries.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> map = countries.get(continent);
            map.putIfAbsent(country, new ArrayList<>());
            List<String> cities = map.get(country);
            cities.add(city);

        }
        //Отпечатване 1ви начин
        countries.forEach((key, value) -> {
            System.out.println(key + ":");

            value.forEach((key1, value1) -> System.out.println(" " + key1 + " -> "
                    + String.join(", ", value1)));
        });
        //Отпечатване 2ри начин
//        countries.entrySet()
//                .forEach(e -> {
//                    System.out.println(e.getKey() + ":");
//
//                    e.getValue().entrySet()
//                            .forEach(ie -> {
//                                System.out.println(" " + ie.getKey() + " -> "
//                                        + String.join(", ", ie.getValue()));
//                            });
//                });
    }
}
