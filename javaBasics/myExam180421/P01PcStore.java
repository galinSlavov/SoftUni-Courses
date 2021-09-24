package Exam180421;

import java.util.Scanner;

public class P01PcStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//•	На първи ред: цената в долари за процесора – реално число в интервала [200.00 … 3000.00]
//•	На втори ред: цената в долари за видео карта – реално число в интервала [100.00 … 1500.00]
//•	На трети ред: цената в долари за една RAM памет – реално число в интервала [80.00 ... 500.00]
//•	На четвърти: ред брой RAM памети – цяло число в интервала [1 ... 4]
//•   На пети ред: процент отстъпка – реално число в интервала [0.01 … 0.1]

        double priceProcessor$ = Double.parseDouble(scanner.nextLine());
        double priceVideo$ = Double.parseDouble(scanner.nextLine());
        double priceRam$ = Double.parseDouble(scanner.nextLine());
        int countRam = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double priceProcessorLv = priceProcessor$ * 1.57;
        double priceVideoLv = priceVideo$ * 1.57;
        double priceRamLv = priceRam$ * 1.57;

        double totalRam = priceRamLv * countRam;
        double processorPriceDisc = priceProcessorLv - (priceProcessorLv * discount);
        double videoPriceDisc = priceVideoLv - (priceVideoLv * discount);

        double allNeededSum = totalRam + processorPriceDisc + videoPriceDisc;

        System.out.printf("Money needed - %.2f leva.",allNeededSum);
    }
}
