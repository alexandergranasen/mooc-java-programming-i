
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int amountOfPositives = 0;
        int amountOfNegatives = 0;
        double average = 0;
        
        
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number > 0){
                total += number;
                amountOfPositives++;
            }
            
            if(number < 0){
                total += number;
                amountOfPositives++;
            }
            
            if(number == 0){
                break;
            }
        }
        
        if(amountOfPositives + amountOfNegatives > 0){
            average = (double)total/(amountOfPositives+amountOfNegatives);
        }
        
        System.out.println("Average of the numbers: " +average);
    }
}
