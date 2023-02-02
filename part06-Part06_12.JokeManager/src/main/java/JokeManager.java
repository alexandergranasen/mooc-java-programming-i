
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import sun.awt.X11.XConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander Granåsen
 */
public class JokeManager {
    
    public JokeManager(){}
    
    private ArrayList<String> jokes = new ArrayList<String>();
        
    public void addJoke(String joke)
    {
        jokes.add(joke);
    }

    public String drawJoke()
    {
        if (jokes.isEmpty()) 
        {
            return "Jokes are in short supply.";
        } 
        else 
        {
            Random rand = new Random();
            int randomIndex = (int)(Math.random() * jokes.size());
            return jokes.get(randomIndex);
        }
    }

    public void printJokes()
    {
        for (String joke : jokes) {
        System.out.println(joke);
    }
    }
}
