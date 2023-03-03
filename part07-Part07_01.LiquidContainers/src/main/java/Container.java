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
    
    public void setAmount(int amount)
    {
        this.amount = amount;
    }
    
    public int getMaxAmount()
    {
        return this.maxAmount;
    }
   
    
    public void add(int amount)
    {
        if(amount > 0)
        {
            if(this.amount + amount <= 100)
            {
                this.amount += amount;
            } 
            else 
            {
                this.amount = 100;
            }
        }
    }
    
    public void remove(int amount)
    {
        if(this.amount - amount >= 0)
        {
            this.amount -= amount;
        }
        else 
        {
            this.amount = 0;
        }
    }
    
    @Override
    public String toString()
    {
        return this.name+": "+this.amount+"/"+this.maxAmount;
    }
}
