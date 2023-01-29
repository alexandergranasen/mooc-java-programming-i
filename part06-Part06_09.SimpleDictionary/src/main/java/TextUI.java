
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    /**
     *
     * @param scanner
     * @param dictionary
     */
    public TextUI(Scanner scanner, SimpleDictionary dictionary)
    {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    /**
     *
     */
    public void start()
    {
        boolean isRunning = true;
        while(isRunning)
        {
            System.out.println("Command: ");
            String word = scanner.nextLine();
            
            switch(word)
            {
                case "add":
                    add();
                    break;
                case "search":
                    search();
                    break;
                case "end":
                    terminate();
                    isRunning = false;
                default:
                    unknownCommand();
                    break;
            }
        }
    }
    
    public void add() 
    {
        System.out.println("Word:");
        String englishWord = scanner.nextLine();

        System.out.println("Translation");
        String finnishWord = scanner.nextLine();

        dictionary.add(englishWord, finnishWord);
    }
    
    public void search()
    {
        System.out.println("Word to translate:");
        String wordToTranslate = scanner.nextLine();

        if(dictionary.translate(wordToTranslate) == null)
        {
            System.out.println("Word " + wordToTranslate + " was not found");
        }
        else 
        {
            System.out.println("Translation: " +dictionary.translate(wordToTranslate));
        }
    }
    
    public void terminate()
    {
        System.out.println("Bye bye!");
    }
    
    public void unknownCommand()
    {
        System.out.println("Unknown command");
    }
}
