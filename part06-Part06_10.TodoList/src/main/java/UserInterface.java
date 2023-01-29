
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander Granåsen
 */
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner)
    {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start()
    {
        boolean isRunning = true;
        
        while(isRunning)
        {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            
            switch(input)
            {
                case "add":
                    add();
                    break;
                case "list":
                    print();
                    break;
                case "remove":
                    remove();
                    break;
                case "stop":
                    isRunning = false;
            }
            
        }
    }
    
    public void add()
    {
        System.out.println("To add:");
        String item = scanner.nextLine();
        list.add(item);
    }
    
    public void print()
    {
        list.print();
    }
    
    public void remove()
    {
        System.out.println("Which one is removed?");
        String number = scanner.nextLine();
        list.remove(Integer.parseInt(number));
    }
}
