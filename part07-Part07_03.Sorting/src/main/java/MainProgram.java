
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) 
    {
        // write your test code here
        int[] numbers = {-1, 3, 1, 7, 4, 5, 2, 4, 3}; //-1, 3, 1, 7, 4, 5, 2, 4, 3 start index 7 expected:<8> but was:<0>
        
        System.out.println("Smallest number: " + MainProgram.smallest(numbers));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallestFrom(numbers, 7));
        
        MainProgram.sort(numbers);
        
    }

    /**
     * A method that returns the smallest number in an array
     * @param numbers An array of numbers
     * @return The smallest number
     */
    static public int smallest(int[] numbers) 
    {
        int smallest = numbers[0];
        
        for(int i = 0; i < numbers.length-1; i++)
        {
            if(numbers[i] < smallest)
            {
                smallest = numbers[i];
            }
        }
        
        return smallest;
    }
    
    /**
     * A method that returns the index of the smallest number in an array
     * @param numbers An array of numbers
     * @return The index position of the smallest number
     */
    static public int indexOfSmallest(int[] numbers)
    {
        int smallest = numbers[0];
        int indexOfSmallest = 0;
        
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] < smallest)
            {
                smallest = numbers[i];
                indexOfSmallest = i;
            }
        }
        
        return indexOfSmallest;
    }
    
    /**
     * A method that returns the index of the smallest number in an array
     * from the position given
     * @param numbers An array of numbers
     * @param position The index position of the smallest number
     * @return 
     */
    static public int indexOfSmallestFrom(int[] numbers, int startIndex)
    {
        int smallest = numbers[startIndex];
        int indexOfSmallest = startIndex;
                
        for(int i = startIndex; i < numbers.length; i++)
        {
            if(numbers[i] < smallest)
            {   
                smallest = numbers[i];
                indexOfSmallest = i;
            }
        }
        
        return indexOfSmallest;
    }
    
    public static void swap(int[] numbers, int index1, int index2)
    {
        int n1 = numbers[index1];
        int n2 = numbers[index2];
        
        numbers[index1] = n2;
        numbers[index2] = n1;
    } 
    
    public static void sort(int[] numbers)
    {
        System.out.println("Before sort: " +Arrays.toString(numbers));
        
        for(int i = 0; i < numbers.length; i++)
        {
            swap(numbers, i, indexOfSmallestFrom(numbers, i));
        }
        
        System.out.println("After sort: " +Arrays.toString(numbers));
    }
}



