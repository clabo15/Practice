import java.util.stream.IntStream;

public class Main {
    
    // Use this method
    private static void fizzBuzzNormal(int num){
        for (int i = 1; i <= num; i++){
            if((i == 0) && ((i % 7) == 0)) // multiple of 5 and 7
                System.out.println("fizzbuzz");
            else if ((i % 5) == 0 ) // multiple of just 5
                System.out.println("fizz");
            else if ((i % 7) == 0) // multiple of just 7
                System.out.println("buzz");
            else
                System.out.println(i); //Not a multiple of 5 or 7
        }
    }
    
  // Complicated method
    private static void fizzBuzzJava8(int num){
        IntStream.rangeClosed(1, num)
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz"
                : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
    
    public static void main(String args[]){
        fizzBuzzJava8(10);
        System.out.println("");
        fizzBuzzNormal(10);
        
    }
}
