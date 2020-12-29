
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Name of the file:");
        String filename = scanner.nextLine();
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try(Scanner reader = new Scanner(Paths.get(filename)))
        {
            while(reader.hasNextLine())
            {
                names.add(reader.nextLine());
            }
            
        if(names.contains(searchedFor)){
            System.out.println("Found!");
        } else {
            System.out.println("Not found!");
        }
        } 
        catch (Exception e) 
        {
            System.out.println("Reading the file " + filename + " failed.");
        }
    }
}
