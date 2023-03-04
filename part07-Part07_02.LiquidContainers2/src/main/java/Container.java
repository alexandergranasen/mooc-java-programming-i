/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander Granåsen
 */
import java.text.MessageFormat;

public class Container 
{

    private int liquidAmount;

    public Container() {}

    public int contains() 
    {
        return liquidAmount;
    }

    public void add(int amount) 
    {
        if (amount > 0) 
        {
            this.liquidAmount += amount;
        }

        if (this.liquidAmount > 100) 
        {
            this.liquidAmount = 100;
        }
    }

    public void remove(int amount) 
    {
        if (amount > 0) 
        {
            this.liquidAmount -= amount;
        }
        if (this.liquidAmount < 0) 
        {
            liquidAmount = 0;
        }
    }

    @Override
    public String toString() 
    {
        return MessageFormat.format("{0}/100", liquidAmount);
    }
}