
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write an number: ");
        int number = Integer.valueOf(scanner.nextLine());       
        int total = number*number;
        System.out.println(total);
    }
}
