
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] numbers = {2,1,3,0};
        String[] stringArray = {"Kalle", "Tjatte", "Fnatte"};
        
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(5);
        integerArrayList.add(2);
        integerArrayList.add(0);
        integerArrayList.add(3);
        
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Kalle");
        stringArrayList.add("Fnatte");
        stringArrayList.add("Tjatte");
        
        sort(numbers);        
        sort(stringArray);
        sortIntegers(integerArrayList);
        sortStrings(stringArrayList);
        
        
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(stringArray));
        System.out.println(integerArrayList);
        System.out.println(stringArrayList);
        
        
    }
    
    /**
     * A method that sorts an array to find the smallest number
     * from the position given
     * @param numbers An array of numbers
     */
    public static void sort(int[] numbers)
    {
        Arrays.sort(numbers);
    }
    
    /**
     * A method that sorts an array of strings.
     * @param strings 
     */
    public static void sort(String[] stringArray) 
    {
        Arrays.sort(stringArray);
    }
    
    /**
     * A method that sorts an arraylist of integers.
     * @param integers 
     */
    public static void sortIntegers(ArrayList<Integer> integerArrayList)
    {
        Collections.sort(integerArrayList);
    }
    
    /**
     * A method that sorts an arraylist of strings
     */
    public static void sortStrings(ArrayList<String> stringArrayList)
    {
        Collections.sort(stringArrayList);
    }
}


