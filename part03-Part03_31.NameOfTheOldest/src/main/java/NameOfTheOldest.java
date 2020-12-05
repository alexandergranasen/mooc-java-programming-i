
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int age, oldestAge = 0;
        String helperName = "";

        while (true) 
        {
            String input = reader.nextLine();
            String[] parts = input.split(",");
            if (input.equals("")) 
            {
            break;
            }
        
            age = Integer.valueOf(parts[1]);
            if (age >= oldestAge) {
                oldestAge = age;
                helperName = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + helperName);
    }   
}
        
