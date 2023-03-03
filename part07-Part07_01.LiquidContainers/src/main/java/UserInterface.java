
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
        this.containerRegistry.printContainers();
        while (true) 
        {
            System.out.print("> ");

            String command = "";
            String stringAmount = "";
            int integerAmount = 0;
            
            String input = scanner.nextLine();
            String[] parts = new String[2];
            
            if(input.contains(" "))
            {
                parts = input.split(" ");
                command = parts[0];
                stringAmount = parts[1];
                integerAmount = convertToInt(stringAmount);
            } else 
            {
                command = input;
            }           

            if(command.equals("quit")) {
                break;
            }
            else if(command.equals("add")) 
            {
                addAmount(integerAmount);
            }
            else if(command.equals("move"))
            {
                moveAmount(integerAmount);
            }
            else if(command.equals("remove"))
            {
                removeAmount(integerAmount);
            }
            containerRegistry.printContainers();
        }
    }
    
    public void addAmount(int amount)
    {
        
        this.containerRegistry.getFirstContainer().add(amount);            
    }
    
    public void moveAmount(int amount)
    {
        if(this.containerRegistry.getFirstContainer().showAmount() >= amount)
        {
            this.containerRegistry.getSecondContainer().add(amount);
            this.containerRegistry.getFirstContainer().remove(amount);
        }
        else if(amount > this.containerRegistry.getFirstContainer().showAmount())
        {
            this.containerRegistry.getSecondContainer().add(this.containerRegistry.getFirstContainer().showAmount());
            this.containerRegistry.getFirstContainer().remove(amount);
        }
    }
    
    public void removeAmount(int amount)
    {
        this.containerRegistry.getSecondContainer().remove(amount);
    }   
     
    public int convertToInt(String input)
    {
        try
        {
            int number = Integer.parseInt(input);
            return number;
        } catch(Exception e)
        {
            System.out.println("You need to input a number after add (example: add 150) " + e.getMessage());
        }
        return 0;
    }
}

