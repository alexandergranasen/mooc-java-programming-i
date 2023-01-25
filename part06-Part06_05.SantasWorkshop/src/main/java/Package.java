
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
public class Package 
{
    private ArrayList<Gift> gifts = new ArrayList<Gift>();
            
    public void addGift(Gift gift) 
    {
        this.gifts.add(gift);
    }
    
    public int totalWeight() 
    {
        if(this.gifts.isEmpty())
        {
            return 0;
        }
        
        int totalWeight = 0;
        
        for(int i = 0; i<this.gifts.size();i++)
        {
            
            totalWeight += this.gifts.get(i).getWeight();
        }
        return totalWeight;
    }
}
