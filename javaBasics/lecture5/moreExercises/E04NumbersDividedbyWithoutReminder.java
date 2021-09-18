package lecture5.moreexercises;

import java.util.Scanner;

public class E04NumbersDividedbyWithoutReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0){
                System.out.println(i);
            }

        }
    }
}
