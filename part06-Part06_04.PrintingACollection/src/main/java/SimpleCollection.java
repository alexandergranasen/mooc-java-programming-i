
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) 
    {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) 
    {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() 
    {
        return this.elements;
    }
    
    @Override
    public String toString() 
    {
        
        if(elements.isEmpty()) 
        {
            return "The collection "+this.name+" is empty.";
        }
        
        String output = "";
        String listOfElements = "";
        
        if(elements.size() == 1) 
        {
            for(String element: elements) 
            {
                output = element;
            }
            return "The collection " + this.name + " has " + this.elements.size() + " element:\n" +output;
        } 
        else 
        {
            for(String element: elements) {
                output = output+element+"\n";
            }
            return "The collection " + this.name + " has " + this.elements.size() + " elements:\n" +output;
        }
    }
}
