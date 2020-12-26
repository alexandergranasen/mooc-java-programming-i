import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if(name.length() == 0){
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name, duration));
        }
        
        System.out.println("Programs maximum duration? ");
        int maxDuration = Integer.parseInt(scanner.nextLine());
        for(TelevisionProgram televisionProgram: programs){
            if(televisionProgram.getDuration() <= maxDuration){
                System.out.println(televisionProgram);
            }
        }
    }
}
