
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int[] ages = new int[50];
        String[] names = new String[50];
        int count = 0;

        while (true) 
        {
            try 
            {
                String input = reader.nextLine();
                if (input.equals("")) 
                {
                break;
                }
            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            names[count] = parts[0];
            ages[count] = Integer.valueOf(parts[1]);
            count = count + 1;    
            } catch(IndexOutOfBoundsException e) 
            {
                System.out.println("You have to enter 'name', 'age' then press enter.");
            }
        }  
        
        int oldestAge = 0;
        String oldestName = "";
        
        for(int i = 0; i < ages.length; i++)
        {
            if(ages[i] >= oldestAge)
            {
                oldestAge = ages[i];
                oldestName = names[i];
            }
        }
        System.out.println("The oldest age in the group is: " + oldestName);
    }
}
