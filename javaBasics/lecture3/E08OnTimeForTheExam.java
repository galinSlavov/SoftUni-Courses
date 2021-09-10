package lecture3;

import java.util.Scanner;

public class E08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        //Превръщане на часове в минуни
        int examTime = examHour * 60 + examMinutes;
        int arriveTime = arriveHour * 60 + arriveMinutes;
        String output = "";
        String output2 = "";
        int diff = 0;

        if (arriveTime < examTime - 30) {// early
            output = "Early";


        } else if (arriveTime <= examTime) { //onTime
            output = "On time";


        } else if (arriveTime > examTime) {//late
            output = "Late";
             diff = arriveTime - examTime;
            if (diff < 60) {
                output2 = String.format("%d minutes after the start", diff);

            } else {
                diff = arriveTime - examTime;
                int hours = diff / 60;
                int minutes = diff % 60;
                if (minutes < 10) {
                    output2 = String.format("%d:0%d hours after the start", hours, minutes);

                } else {
                    output2 = String.format("%d:%d hours after the start", hours, minutes);
                }
            }

        }
        System.out.println(output);
        System.out.println(output2);
    }

}
