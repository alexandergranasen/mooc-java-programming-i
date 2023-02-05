/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander Granåsen
 */
public class Container
{
    private String name;
    private int amount;
    private final int maxAmount = 100; 
    private ContainerRegistry containerRegistry;
    
    public Container(String name)
    {
        this.name = name;
        this.amount = 0;
    }
    
    public Container(String name, int amount)
    {
        this.name = name;
        this.amount = amount;
    }
    
    public int showAmount()
    {
        return this.amount;
    }
   
    
    public void add(int amount)
    {
        this.amount += amount;
    }
    
    public void move(int amount, Container container)
    {
        if(amount > this.showAmount())
        {
            this.remove(amount);
            container.add(amount);
        }
    }
    
    public void remove(int amount)
    {
        this.amount -= amount;
    }
    
    @Override
    public String toString()
    {
        return this.name+": "+this.amount+"/"+this.maxAmount;
    }
}
