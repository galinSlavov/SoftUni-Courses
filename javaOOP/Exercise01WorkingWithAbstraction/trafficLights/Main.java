package Exercise01WorkingWithAbstraction.trafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Colours [] signals = Arrays.stream(scanner.nextLine().split(" "))
                .map(Colours::valueOf).toArray(Colours[]::new);

        List<TrafficLights> trafficLights = new ArrayList<>();

        for (Colours colours : signals){
            TrafficLights trafficLights1 = new TrafficLights(colours);
            trafficLights.add(trafficLights1);
        }

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            for (TrafficLights trafficLights1 : trafficLights){
                trafficLights1.changeColours();
                System.out.print(trafficLights1 + " ");
            }
            System.out.println();
        }
    }
}
