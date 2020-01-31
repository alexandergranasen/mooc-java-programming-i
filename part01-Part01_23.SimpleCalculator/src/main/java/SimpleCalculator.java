
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        
        int addition = first + second;
        int subtraction = first - second;
        int multiplication = first * second;
        double division = (double)first/second;
        
        
        System.out.println(first+" + "+second+" = "+addition);
        System.out.println(first+" - "+second+" = "+subtraction);
        System.out.println(first+" * "+second+" = "+multiplication);
        System.out.println(first+" / "+second+" = "+division);
    }
}
