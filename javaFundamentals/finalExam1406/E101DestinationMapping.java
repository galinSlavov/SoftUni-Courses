package finalExam1406;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E101DestinationMapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(?<separator>[\\/=])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> destination = new ArrayList<>();

        while (matcher.find()){
           destination.add(matcher.group("destination"));
        }

        int travelPoint = destination.stream().mapToInt(String::length).sum();
        String resultText = String.join(", ",destination);

        System.out.printf("Destinations: %s%n",resultText);
        System.out.printf("Travel Points: %d",travelPoint);
    }
}
