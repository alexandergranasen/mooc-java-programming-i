
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
public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getTime() {
        return this.time;
    }
    
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.time + ", " +this.ingredients.toString();
    }
}
