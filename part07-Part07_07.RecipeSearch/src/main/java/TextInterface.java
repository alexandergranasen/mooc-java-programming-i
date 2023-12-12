
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
    private RecipeBook recipeList;

    public TextInterface(Scanner scanner, RecipeBook recipes) {
        this.scanner = scanner;
        this.recipeList = recipes;
    }

    public void start() {

        boolean commandLoop = true;
        printCommands();    

        while (commandLoop) {
        
            String command = scanner.nextLine();

            switch (command) {
                case "stop":

                    commandLoop = false;
                    break;
                case "list":
                    System.out.println("Recipes:");
                    recipeList.printRecipeBook();

                    break;
                case "find name":
                    System.out.println("Search word: ");
                    String searchWord = scanner.nextLine();

                    recipeList.printByName(searchWord);

                    break;
                case "find cooking time":
                    System.out.println("Search word: ");
                    searchWord = scanner.nextLine();

                    recipeList.printByTime(searchWord);

                    break;
                case "find ingredient":
                    System.out.println("Search word: ");
                    searchWord = scanner.nextLine();

                    recipeList.printByIngredient(searchWord);

                    break;
                case "commands":
                    printCommands();
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
                + "list - list the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient\n"
                + "commands - show the commands\n"        
                + "------------------------------------------------------\n"
                + "Enter command: ");
        }
}
