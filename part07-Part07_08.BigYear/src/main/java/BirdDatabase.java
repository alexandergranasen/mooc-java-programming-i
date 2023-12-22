
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
public class BirdDatabase {
    private ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList<Bird>();
    }
    
    public void addBird(Bird bird) {
        this.birds.add(bird);
    }
    
    public void addObservation(String birdName) {
        if(birds.isEmpty()) System.out.println("There are no birds in the database.");
        for(Bird bird : birds) {
            if(bird.getName().equals(birdName)) {
                bird.addObservation();
            } else {
                System.out.println("Not a bird!");
            }
        } 
    }
    
    public void printBird(String searchedBird) {
        if(birds.isEmpty()) {
            System.out.println("There are no birds in the database.");
        }
        for(Bird bird : birds) {
            if(bird.getName().equals(searchedBird)) {
                System.out.println(bird.toString());
            } else {
                System.out.println("Not a bird!");
            }
        } 
    }
    
    public void printBirds() {
        if(this.birds.isEmpty()) {
            System.out.println("There are no birds in the database.");
        } else {
            for(Bird bird : birds) {
                System.out.println(bird.toString());
            }
        }
    }
}