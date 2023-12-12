
import java.util.ArrayList;

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
class RecipeBook {
    ArrayList<Recipe> recipes;
    
    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    @Override
    public String toString() {
        return this.recipes.toString();
    }

    public void printByName(String name) {
        if (this.recipes.isEmpty()) {
            System.out.println("No recipes are found.");
        } else {
            for (Recipe e : this.recipes) {
                if (e.getName().toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(e);
                }
            }
        }
    }

    public void printByTime(String time) {
        if (this.recipes.isEmpty()) {
            System.out.println("No recipes are found.");
        } else {
            for (Recipe e : this.recipes) {
                if (e.getTime() <= Integer.valueOf(time)) {
                    System.out.println(e);
                }
            }
        }
    }

    public void printByIngredient(String ingredient) {

        if (this.recipes.isEmpty()) {
            System.out.println("No recipes are found.");
        } else {
            for (Recipe e : this.recipes) {
                if (e.getIngredients().contains(ingredient.toLowerCase())) {

                    System.out.println(e);
                }
            }
        }
    }

    public void printRecipeBook() {
        for (Recipe e : this.recipes) {
            System.out.println(e);
        }
    }
}