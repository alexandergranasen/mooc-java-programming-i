
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
    }
    
    public void addContainer(Container container)
    {
        this.containerRegistry.add(container);
    }
    
    public void printContainers()
    {
        for(Container container : containerRegistry)
        {
            System.out.println(container.toString());
        }
    }
}
