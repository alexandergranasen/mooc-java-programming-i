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

public class LiquidContainers2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();
        
        UserInterface ui = new UserInterface(scanner, containerOne, containerTwo);
        ui.start();
    }
}

