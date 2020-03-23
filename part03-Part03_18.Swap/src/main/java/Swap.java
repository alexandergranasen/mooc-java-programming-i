
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }

        System.out.println("Give two index to swap: ");
        int indexOne = Integer.valueOf(scanner.nextLine());
        int indexTwo = Integer.valueOf(scanner.nextLine());
        int helper = 0;
        
        for(int i = 0; i < array.length; i++){
                helper = array[indexOne];
                System.out.println("Helper: " +helper);
                
                array[indexOne] = array[indexTwo];
                array[indexTwo] = helper;
        }

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
