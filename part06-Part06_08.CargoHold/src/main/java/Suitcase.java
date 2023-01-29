
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
public class Suitcase
{
    private ArrayList<Item> items;
    private int maxWeight; 
    
    public Suitcase(int maxWeight) 
    {
        items = new ArrayList<Item>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) 
    {
        int currentWeight = 0;
        
        for(int i = 0; i < items.size(); i++)
        {
            currentWeight += items.get(i).getWeight();
        }
        
        if(currentWeight+item.getWeight() <= this.maxWeight)
        {
            items.add(item);
        }        
    }
    
    public void printItems() 
    {
        for(Item item : items)
        {
            System.out.println(item.toString());
        }
    }
    
    public int totalWeight()
    {
        int totalWeight = 0;
        for(Item item : items)
        {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem()
    {
        Item heaviestItem;
        
        if(items.isEmpty())
        {
            return null;
        }            
        
        heaviestItem = items.get(0);
        
        for(Item item : items)
        {
            if(item.getWeight() > heaviestItem.getWeight())
            {
                heaviestItem = item;
            }
        }
        
        return heaviestItem;
    }
    
    @Override
    public String toString()
    {
        int totalWeight = 0;
        for(Item item : items)
        {
            totalWeight += item.getWeight();
        }
        
        if(items.isEmpty())
        {
            return "no items ("+totalWeight+" kg)";
        }
        else if(items.size() == 1) 
        {
            return items.size()+" item ("+totalWeight+" kg)";
        }
        else 
        {
            return items.size()+" items ("+totalWeight+" kg)";
        }
    }
}
