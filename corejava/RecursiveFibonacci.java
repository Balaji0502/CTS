import java.util.Scanner;
public class RecursiveFibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n to find the nth Fibonacci number: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = fibonacci(n);
            System.out.println("Fibonacci number at position " + n + " is: " + result);
        }
        sc.close();
    }
}
