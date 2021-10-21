package exam1007;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Coed");
        list.add("Me");
        list.add("Right");

        // Before java 8 Stream it takes 4 to 5 lines of code
        List<String> listTemp = new ArrayList<String>();
        for (String s : list) {
            if (s.contains("e")) {
                listTemp.add(s);
            }
        }
        System.out.println(listTemp);

        // After java 8 Stream it takes only one line of code
        listTemp = list.stream().filter(s -> s.endsWith("e")).collect(Collectors.toList());
        System.out.println(listTemp);
    }
}
