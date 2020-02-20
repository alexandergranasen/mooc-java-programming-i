
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxValue = Integer.parseInt(scanner.nextLine());
        if(maxValue < 0) {
            System.out.println(maxValue*-1);
        } else {
            System.out.println(maxValue*1);
        }
        
        
    }
}
