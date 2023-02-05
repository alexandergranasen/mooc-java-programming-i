
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContainerRegistry containerRegistry = new ContainerRegistry();
        
        UserInterface ui = new UserInterface(scanner, containerRegistry);
        ui.start();
    }

}
