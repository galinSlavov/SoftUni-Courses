package lecture01;

import java.util.Scanner;

public class E11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int inte = Integer.parseInt(scanner.nextLine());


        int sum = 0;
        for (inte = inte; inte <= 100 ; inte++) {

            sum = n * inte;
            if (inte >= 10){
                sum = n * inte;
                System.out.printf("%d X %d = %d\n",n,inte,sum);
                return;
            }

            System.out.printf("%d X %d = %d\n",n,inte,sum);
        }
    }
}
