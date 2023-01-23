
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
public class Stack
{
    private ArrayList<String> stack;
    
    public Stack() {
        this.stack = new ArrayList<String>();
    }
    
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
    
    public ArrayList<String> values() {
        return this.stack;
    }
    
    public void add(String value) {
        this.stack.add(value);
    }
    
    public String take() {
        String taken;
        
        if(stack.isEmpty()){
            return "List is already empty";
        }
        taken = this.stack.get(this.stack.size()-1);
        this.stack.remove(taken);
        
        return taken;
    }
}
