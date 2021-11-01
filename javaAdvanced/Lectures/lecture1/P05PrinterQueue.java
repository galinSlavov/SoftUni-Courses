package lecture1;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();
        String task = scanner.nextLine();

        while (!task.equals("print")){

            if (task.equals("cancel")){
               if (queue.isEmpty()){
                   System.out.println("Printer is on standby");
               }else{
                   String canceledTask = queue.poll();
                   System.out.println("Canceled" + canceledTask);
               }

            }else {
                queue.offer(task);
            }

            task = scanner.nextLine();
        }

//    1.    for (String file : queue) {
//            System.out.println(file);
//        }
//    2.    System.out.println(queue.stream().map(String::valueOf)
//                .collect(Collectors.joining(System.lineSeparator())));
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
