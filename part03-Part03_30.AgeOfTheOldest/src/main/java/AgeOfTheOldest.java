
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int age, oldestAge = 0;

        while (true) 
        {
            String input = reader.nextLine();
            String[] parts = input.split(",");
            if (input.equals("")) 
            {
            break;
            }
        
            age = Integer.valueOf(parts[1]);
            if (age >= oldestAge) 
            {
                oldestAge = age;
            }  
       }
        System.out.println("The oldest age in the group is: " +oldestAge);
    }   
}
