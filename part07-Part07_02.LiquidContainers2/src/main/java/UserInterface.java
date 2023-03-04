
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

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Container containerOne;
    private Container containerTwo;
    
    
    public UserInterface(Scanner scanner, Container containerOne, Container containerTwo)
    {
        this.scanner = scanner;
        this.containerOne = containerOne;
        this.containerTwo = containerTwo;
    }
    
    public void start()
    {
        while (true) 
        {
            try
            {
                System.out.println("First: " + containerOne);
                System.out.println("Second: " + containerTwo);

                String input = scanner.nextLine();
                if (input.equals("quit")) 
                {
                    break;
                }


                final String[] parts = input.split(" ");
                final String command = parts[0];
                final int amount = Integer.parseInt(parts[1]);


                if (command.equalsIgnoreCase("add")) 
                {
                    containerOne.add(amount);
                }

                if (command.equalsIgnoreCase("move")) 
                {
                    containerTwo.add(Math.min(containerOne.contains(), amount));
                    containerOne.remove(amount);
                }

                if (command.equalsIgnoreCase("remove")) 
                {
                    containerTwo.remove(amount);
                }
            }catch(Exception e)
            {
                System.out.println("Please enter a command like this (example):"
                        + "\nadd 10\nmove 5\nquit");
            }
        }
    }
}