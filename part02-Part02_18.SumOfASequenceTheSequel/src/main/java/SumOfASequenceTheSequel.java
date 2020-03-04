
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNumber = 0;
        int lastNumber = 0;
        System.out.println("First number?");
        firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        lastNumber = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        for(int i = firstNumber; i <= lastNumber; i++){
            sum += i;
        }
        
        System.out.println("The sum is " +sum);
    }
}

