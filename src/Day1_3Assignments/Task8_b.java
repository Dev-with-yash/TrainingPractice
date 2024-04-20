package Day1_3Assignments;

public class Task8_b {

    // Recursive function to find the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


    public static int[] fibonacciArray(int n) {
        if (n <= 0) {
            return new int[0];
        }

        int[] fibArray = new int[n];
        for (int i = 0; i < n; i++) {
            fibArray[i] = fibonacci(i);
        }
        return fibArray;
    }

    public static void main(String[] args) {
        int n = 10;
        int nthFib = fibonacci(n);
        System.out.println("nth fib: " + nthFib);

        // Store the first n Fibonacci numbers in an array
        int[] fibNumbers = fibonacciArray(n);
        System.out.println("First " + n + " Fibonacci numbers:");
        for (int num : fibNumbers) {
            System.out.print(num + " ");
        }
    }
}
