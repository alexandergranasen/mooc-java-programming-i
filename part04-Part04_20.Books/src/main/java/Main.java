import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
        if(title.length() == 0){
            break;
        }
            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            
            books.add(new Book(title, pages, publicationYear));
        }
        System.out.println("What information will be printed?");
        String information = scanner.nextLine();
        if(information.equals("everything")){
            for(Book book : books){
                System.out.println(book.toString());
            }
        } else if(information.equals("name")) {
            for(Book book : books){
                System.out.println(book.getTitle());
            }
        } else {
            System.out.println("Nothing will be printed.");
        }
    }
}
