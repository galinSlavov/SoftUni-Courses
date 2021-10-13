package lecture09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dates = scanner.nextLine();

        String regex = "\\b(?<days>\\d{2})(?<separator>[. \\/-])(?<months>[A-Z][a-z]{2})\\2(?<years>\\d{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matchedDates = pattern.matcher(dates);

        while (matchedDates.find()){
            String days = matchedDates.group("days");
            String months = matchedDates.group("months");
            String years = matchedDates.group("years");

            System.out.printf("Day: %s, Month: %s, Year: %s%n",days,months,years);
        }
    }
}
