
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int amountOfNumbers = 0;
        
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number != 0){
                total += number;
                amountOfNumbers++;
            }
            
            if(number == 0){
                break;
            }
        }
        System.out.println("Number of numbers: " +amountOfNumbers);
        System.out.println("Sum of the numbers: " +total);
    }
}
