package exercise3;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String > elements = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputElements =  input.split("\\s+");
            //1.way
            for (String el : inputElements){
              elements.add(el);
          }
            //2.way
            //Collections.addAll(elements,inputElements);
            //3.way
            //elements.addAll(Array.asList(inputElements));
        }
        elements.forEach(el -> System.out.print(el + " "));
    }
}
