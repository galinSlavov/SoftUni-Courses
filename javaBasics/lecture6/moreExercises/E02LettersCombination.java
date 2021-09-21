package lecture6.moreexercises;

import java.util.Scanner;

public class E02LettersCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();


        char begin = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);
        char omit = scanner.next().charAt(0);

        int count =0;

        for (char i = begin; i <=end ; i++) {

            for (char j = begin; j <=end ; j++) {

                for (char k = begin; k <=end ; k++) {

                    if (i != omit && j != omit && k !=omit){

                        count++;
                        sb.append(i);
                        sb.append(j);
                        sb.append(k);
                        sb.append(" ");
                    }

                }

            }

        }
        System.out.print(sb.toString());
        System.out.print(count);
    }
}
