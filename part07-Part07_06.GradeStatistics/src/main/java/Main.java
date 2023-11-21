
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GradeCalculator calc = new GradeCalculator();
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        while(input != -1) {
            input = scanner.nextInt();
            if(input > 0 && input <= 100) {
                calc.addTotalInputs();
                calc.addTotalPoints(input);
            }
        }
        
        calc.pointAverage();
        calc.pointPassingAverage();
        calc.passPercentage();
        calc.gradeDistribution();
    }
}
