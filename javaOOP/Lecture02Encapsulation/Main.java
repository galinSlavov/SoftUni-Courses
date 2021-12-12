package Lecture02Encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String > person = new ArrayList<>();

        person.add("Ivan");
        person.add("Gosho");
        person.add("Pesho");
        person.add("Stanko");

        List<Integer> age = new ArrayList<>();

        age.add(31);
        age.add(35);
        age.add(21);
        age.add(29);

        System.out.println(person);
        System.out.println(age);
    }
}
