
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
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight)
    {
        suitcases = new ArrayList<Suitcase>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase)
    {
        if(suitcase.totalWeight() <= this.maxWeight)
        {
            this.suitcases.add(suitcase);
        }
    }
    
    @Override
    public String toString()
    {
        int totalWeight = 0;
        for(Suitcase suitcase : suitcases)
        {
            totalWeight += suitcase.totalWeight();
        }
        return this.suitcases.size() + " suitcases " +"("+totalWeight+" kg)";
    }
}
