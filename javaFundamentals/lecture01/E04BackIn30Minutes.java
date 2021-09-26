package lecture01;

import java.util.Scanner;

public class E04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int  hours = Integer.parseInt(scanner.nextLine());
       int minutes = Integer.parseInt(scanner.nextLine());


       minutes = minutes + 30;
       if (hours >= 23){
           hours = -1;
       }
       if (minutes > 59){
           hours = hours + 1;
           minutes = minutes - 60;
       }
        System.out.printf("%d:%02d",hours, minutes);
    }
}
