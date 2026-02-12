package WarmUp;
public class Recursion {

    // 5.2: Recursive countdown
    // Print numbers from n down to 0 using recursion.
    public static void countDownRec(int n) {
        if (n>=0) {
            System.out.println(n);
            countDownRec(n-1);
        }
    }

    // 5.3: Recursive count up
    // Print numbers from 0 up to n.
    public static void countUp(int n) {
        if (n>=0) {
        countUp(n-1);
        System.out.println(n);}
    }

    // 5.4: Factorial
    // Return n!
    public static long factorial(int n) {
        if (n>0) {
        return n*factorial(n-1);}

        else if (n==0) {
            return 1;
        }

        else {
            return -1;
        }
    }

    // 5.5: Fibonacci
    // Return the nth Fibonacci number
    public static int fibonacci(int n) {
        // TODO
        return -1;
    }

    // Return the sum of all numbers from n down to 0
    // Must use recursion and return value
    public static int sumDown(int n) {
        if (n>=1) {
            return n + sumDown(n-1);
        }
        else if (n==0) {
            return 0;
        }
        else {
        return -1;}
    }

    public static void main(String[] args) {

        System.out.println("countDownRec(5):");
        countDownRec(5);

        System.out.println("countUp(5):");
        countUp(5);

        System.out.println("factorial(5) expected 120 -> " + factorial(5));

        System.out.println("fibonacci(6) expected 5 -> " + fibonacci(6));

        System.out.println("sumDown(5) expected 15 -> " + sumDown(5));
    }
}
