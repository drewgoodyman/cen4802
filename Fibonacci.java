import java.util.Scanner;

public class Fibonacci {
    /**
     * Calculate the nth term in the Fibonacci sequence.
     * @param n the index of the term to calculate (non-negative integer)
     * @return the nth term in the Fibonacci sequence
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1)+fibonacci(n - 2);
        }
    }
    /**
     * Prompts the user to enter a integer and calculates the corresponding term in the Fibonacci sequence.
     * Displays the result in the console.
     *
     * @param args command line argument is not used
     */
    public static void main(String[] args) {
        System.out.println("Enter a number to find the term in the Fibonacci sequence: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fiboNum = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + fiboNum + ".");
    }
}