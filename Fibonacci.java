import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1)+fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to find the term in the Fibonacci sequence: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fiboNum = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + fiboNum + ".");
    }
}