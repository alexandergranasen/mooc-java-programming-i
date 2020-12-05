
import java.util.Scanner;
import java.util.ArrayList;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String word = scanner.nextLine();
            if(word.equals("")){
                break;
            }
            
            String[] words = word.split(" ");
            for(int i = 0; i < words.length; i++){
                if(words[i].contains("av")) {
                    System.out.println(words[i]);
                }     
            }
        }
    }
}

