
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<Item>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
        System.out.println("Identifier? (empty will stop)");
        String identifier = scanner.nextLine();

        if(identifier.isEmpty()) {
            break;
        }

        System.out.println("Name? (empty will stop)");
        String name = scanner.nextLine();

        if(name.isEmpty()) {
            break;
        }

        Item item = new Item(identifier, name);

        if(items.contains(item)) {
            System.out.println("Already on the list");
        } else {
            items.add(item);   
        }
        }
        
        System.out.println("==Items==");
        for(int i = 0; i<items.size(); i++)
        {
            System.out.println(items.get(i));
        }
    }
    }
