
import java.io.File;
import java.nio.file.Paths;
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
public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        RecipeBook recipeList = new RecipeBook();   
        
        System.out.println("Files to read: ");
        String fileName = scanner.nextLine();
        
        try(Scanner fileScanner = new Scanner(Paths.get(fileName)))
        {   
            // Here we will store all the lines from the .txt file
            ArrayList<String> fileLines = new ArrayList<>();
            
            // Reads the whole file line-by-line
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                
                // Scanner stops when it encounters an empty line and reads the values before it
                if(line.trim().isEmpty() || !fileScanner.hasNextLine()) {
                    String name = fileLines.get(0);
                    int time = Integer.valueOf(fileLines.get(1));
                    
                    ArrayList<String> ingredientList = new ArrayList<>();
                    
                    for(int i = 2; i < fileLines.size(); i++) {
                        ingredientList.add(fileLines.get(i));
                    }
                    
                    // Adds the recipe to the RecipeBook
                    recipeList.addRecipe(new Recipe(name, time, ingredientList));
                    
                    fileLines.removeAll(fileLines);
                } else {
                    fileLines.add(line); // Here we add all the lines to the ArrayList
                }
            }
            fileScanner.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Reading the file " + fileName + " failed.");
        }    
            TextInterface textInterface = new TextInterface(scanner, recipeList);

            textInterface.start();
    }
}
