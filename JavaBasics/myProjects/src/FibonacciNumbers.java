public class FibonacciNumbers {
    public static void main(String[] args) {
        //Massive size
        int n = 20;
        //Massive for Fibonacci numbers
        int[] fib = new int[n];
        //First 2 numbers of the sequence
        fib[0] = 1;
        fib[1] = 1;
        //Showing of first 2 values
        System.out.print(fib[0] + " " + fib[1]);
        //Calculating the sequences and showing the result
        for (int i = 2; i < n; i++) {
            //Calculating values of element from massive
            fib[i] = fib[i - 1] + fib[i - 2];
            //Showing the value of element
            System.out.print(" " + fib[i]);
        }
    }
}
