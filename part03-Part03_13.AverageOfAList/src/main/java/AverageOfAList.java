
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Double> numbers = new ArrayList<>();
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == -1){
                break;
            }
            
            numbers.add((double)input);
        }
        
        double total = 0;
        double average = 0;
        
        for(int i = 0; i < numbers.size(); i++){
            total += numbers.get(i);
        }
        
        average = total / numbers.size();
        
        System.out.println("Average: " +average);
        
        
        
        
        
        
        
        
        
        
    }
}
