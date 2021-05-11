// Write a function that returns the nth entry in the Fibonacci sequence where n is a number you pass in as an argument to the function.

public class Main {

    static int fib(int n){
        
        // Array of Fibonacci numbers
        int fib[] = new int[n + 2];
        
        // 0th and 1st number of hte series are 0 and 1
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i <= n; i++ ){
            // Add the previous 2 numbers in the series and store it
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
    
    public static void main(String args[]){
        int n = 5;
        System.out.println(fib(n));
    }
}
