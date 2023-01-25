
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandergranasen
 */
public class Room
{
    private ArrayList<Person> personList;
    
    public Room() 
    {
        personList = new ArrayList<Person>();
    }
    
    public void add(Person person) 
    {
        personList.add(new Person(person.getName(), person.getHeight()));
    }
    
    public boolean isEmpty()
    {
        return personList.isEmpty() ? true : false;
    }
    
    public ArrayList<Person> getPersons() 
    {        
        return personList;
    }
    
    public Person shortest() 
    {
        if(personList.isEmpty()) return null;
        
        Person shortest = personList.get(0);
        int height = personList.get(0).getHeight();
        
        for(Person person : personList)
        {
            if(person.getHeight() < height)
            {
                height = person.getHeight();
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take()
    {
        Person shortest = this.shortest();
        
        personList.remove(shortest);
        
        return shortest;
    }
}