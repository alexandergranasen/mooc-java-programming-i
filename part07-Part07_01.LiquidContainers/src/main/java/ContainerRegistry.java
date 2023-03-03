
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander Granåsen
 */
public class ContainerRegistry
{
    private ArrayList<Container> containerRegistry;
    
    public ContainerRegistry()
    {
        containerRegistry = new ArrayList<Container>();
        this.addContainers();
    }

    public void addContainers()
    {
        Container firstContainer = new Container("First");
        Container secondContainer = new Container("Second");
        this.containerRegistry.add(firstContainer);
        this.containerRegistry.add(secondContainer);
    }
    
    public void addAmount(int amount)
    {
        this.containerRegistry.get(0).add(amount);
    }
    
    public Container getFirstContainer()
    {
        return this.containerRegistry.get(0);
    }
    
    public Container getSecondContainer()
    {
        return this.containerRegistry.get(1);
    }
    
    public void printContainers()
    {
        for(Container container : containerRegistry)
        {
            System.out.println(container.toString());    
        }
    }
}
