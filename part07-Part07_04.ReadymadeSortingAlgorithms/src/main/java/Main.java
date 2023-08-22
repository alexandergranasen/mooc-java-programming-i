
import java.sql.SQLOutput;
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] numbers = {3, 1, 5, 99, 3, 12};
        
        System.out.println(Arrays.toString(numbers));
        
        Main.sort(numbers);        
        
        System.out.println(Arrays.toString(numbers));
    }
    
    /**
     * A method that sorts an array to find the smallest number
     * from the position given
     * @param numbers An array of numbers
     */
    public static void sort(int[] numbers)
    {
        // Iterate trough numbers array
        for (int i = 0; i < numbers.length-1; i++)
        {
            // Find the minimum number in unsorted array
            int min_idx = i;
            for (int j = i+1; j < numbers.length-1; j++){
                if (numbers[j] < numbers[min_idx])
                    min_idx = j;
            }
 
            // Swap the found minimum element with the first element
            int temp = numbers[min_idx];
            numbers[min_idx] = numbers[i];
            numbers[i] = temp;
        }

    }
          
    public static void swap(int[] numbers, int index1, int index2)
    {
        int n1 = numbers[index1];
        int n2 = numbers[index2];
        
        numbers[index1] = n2;
        numbers[index2] = n1;
    } 
    

}


