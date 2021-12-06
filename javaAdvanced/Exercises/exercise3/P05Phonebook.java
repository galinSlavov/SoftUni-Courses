package exercise3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        Pattern pat = Pattern.compile("(.+)-(.+)");
        HashMap<String,String > map = new HashMap<>();

        while(!(input = scanner.nextLine()).equals("search")){
            Matcher matcher = pat.matcher(input);
            if(matcher.find()) {
                map.put(matcher.group(1), matcher.group(2));
            }
        }
        while(!(input= scanner.nextLine()).equals("stop")){
            if(map.containsKey(input)){
                System.out.format("%s -> %s\n",input,map.get(input));
            }else{
                System.out.format("Contact %s does not exist.\n",input);
            }
        }


    }

}
