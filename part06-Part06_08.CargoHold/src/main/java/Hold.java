
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
public class Hold
{
    private ArrayList<Suitcase> suitcaseHold;
    private int maxWeight;
    
    public Hold(int maxWeight)
    {
        suitcaseHold = new ArrayList<Suitcase>();
        this.maxWeight = maxWeight;
    }
    
    /**
     * Method that adds a suitcase to hold if it's not larger than the
     * maxweight of the suitcaseHold.
     * 
     * @param suitcase Takes a suitcase as a parameter
     */
    public void addSuitcase(Suitcase suitcase)
    {
        int suitcasesWeight = 0;
                
        for(Suitcase e : this.suitcaseHold)
        {
            suitcasesWeight += e.totalWeight(); 
        }
        if(this.maxWeight - suitcasesWeight >= suitcase.totalWeight())
        {
            this.suitcaseHold.add(suitcase);
        }
    }
    
    public void printItems()
    {
        for(Suitcase suitcase : suitcaseHold)
        {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString()
    {
        int totalWeight = 0;
        for(Suitcase suitcase : suitcaseHold)
        {
            totalWeight += suitcase.totalWeight();
        }
        return this.suitcaseHold.size() + " suitcases " +"("+totalWeight+" kg)";
    }
}
