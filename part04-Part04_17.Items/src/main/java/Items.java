
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter a item, empty will stop: ");
            String itemName = scanner.nextLine();
            if(itemName.isEmpty()){
                break;
            }
            
            items.add(new Item(itemName));
            }
            
            System.out.println("Items: ");
                for(Item item: items){
                    System.out.println(item);
                }

    }
}
