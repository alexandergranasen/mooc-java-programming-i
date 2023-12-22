
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Copyright (C) 2023 Alexander Granåsen at https://github.com/alexandergranasen
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Alexander Granåsen at https://github.com/alexandergranasen
 */
public class TextInterface {

    private Scanner scanner;
    private BirdDatabase birdDatabase;

    public TextInterface(Scanner scanner) {
        this.scanner = scanner;
        birdDatabase = new BirdDatabase();
    }

    public void start() {

        boolean commandLoop = true;
        printCommands();    

        while (commandLoop) {
        
            System.out.print("? ");
            String command = scanner.nextLine();

            switch (command) {
                case "Add":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Name in Latin: ");
                    String latinName = scanner.nextLine();
                    this.birdDatabase.addBird(new Bird(name, latinName));
                    
                    break;
                case "Observation":
                    System.out.print("Bird?: ");
                    String birdObservation = scanner.nextLine();
                    this.birdDatabase.addObservation(birdObservation);
                    
                    break;
                case "All":
                    birdDatabase.printBirds();
                    
                    break;
                case "One":
                    System.out.print("Bird?: ");
                    String birdName = scanner.nextLine();
                    this.birdDatabase.printBird(birdName);

                    break;
                case "Quit":
                    System.out.print("Terminating program.");
                    commandLoop = false;
                    
                    break;
                default:
                    System.out.println("Unknown command");
                    printCommands();
            }      
        }
    }
    
    public void printCommands() {
                System.out.println(
                "------------------------------------------------------\n"
                + "Commands:\n"
                + "------------------------------------------------------\n"
                + "Add - adds a bird\n"
                + "Observation - adds an observation\n"
                + "All - prints all birds\n"
                + "One - prints one bird\n"
                + "Quit - ends the program\n"      
                + "------------------------------------------------------\n");
        }
}
