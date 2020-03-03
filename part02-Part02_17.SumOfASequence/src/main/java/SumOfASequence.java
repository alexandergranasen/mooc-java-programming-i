
import java.awt.BorderLayout;
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = 0;
        System.out.println("Last number?");
        number = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        for(int i = 0; i <= number; i++){
            sum += i;
        }
        
        System.out.println("The sum is " +sum);
        
    }
}
