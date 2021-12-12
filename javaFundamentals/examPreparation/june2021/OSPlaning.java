package examPreparation.june2021;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class OSPlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //tasks
        int[] tasks = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> taskStack = new ArrayDeque<>();
        Arrays.stream(tasks).forEach(taskStack::push);
        //threads
        int[] threads = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> threadQue = new ArrayDeque<>();
        Arrays.stream(threads).forEach(threadQue::offer);

        //task to kill
        int taskToKill = Integer.parseInt(scanner.nextLine());

        int killerThread = 0;

        while(true){
            int currentTask = taskStack.peek();
            int currentThread = threadQue.peek();

            if(currentTask == taskToKill){
                killerThread = currentThread;
                break;
            }

            if(currentThread >= currentTask){
                taskStack.pop();
            }
            threadQue.poll();

        }

        System.out.printf("Thread with value %d killed task %d%n",killerThread,taskToKill);
        threadQue.forEach(t -> System.out.print(t + " "));

        //first thread and last task
    }
}
