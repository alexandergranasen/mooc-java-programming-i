
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOne = Integer.valueOf(scanner.nextLine());
        int sum = numberOne;
        int numberTwo = Integer.valueOf(scanner.nextLine());
        sum += numberTwo;
        
        double squareRoot = Math.sqrt(sum);
        
        System.out.println(squareRoot);
    }
}
