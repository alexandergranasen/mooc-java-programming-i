
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    /**
     *
     * @param register
     * @param scanner
     */
    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    /**
     *
     */
    public void start() {
        readPoints();
        
        System.out.println("");
        printGradeDistribution();
        System.out.println("The average of points: "+register.averageOfPoints());
        System.out.println("The average of grades: "+register.averageOfGrades());
    }

    /**
     *
     */
    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    /**
     *
     */
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
        
    }

    /**
     *
     * @param stars
     */
    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
