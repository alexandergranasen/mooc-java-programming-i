
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
public class UserInterface
{
    private Scanner scanner;
    private ContainerRegistry containerRegistry;
    
    public UserInterface(Scanner scanner, ContainerRegistry containerRegistry)
    {
        this.scanner = scanner;
        this.containerRegistry = containerRegistry;
    }
    
    public void start() 
    {
        while (true) 
        {
            System.out.print("> ");

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            else if(input.equals("add")) 
            {
                addContainers();
            }
            else if(input.equals("show")) 
            {
                containerRegistry.printContainers();
            }
        }
    }
    
    public void addContainers()
    {
        Container firstContainer = new Container("First");
        Container secondContainer = new Container("Second");
        containerRegistry.addContainer(firstContainer);
        containerRegistry.addContainer(secondContainer);
    }


}
