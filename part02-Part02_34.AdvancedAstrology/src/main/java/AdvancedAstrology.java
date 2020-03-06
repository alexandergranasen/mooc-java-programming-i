
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println(" ");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i = number; i > 0; i--){
            System.out.print("1 ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(int i = 0; i < 4; i++){
            printSpaces(size);
            printStars(size);
            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
