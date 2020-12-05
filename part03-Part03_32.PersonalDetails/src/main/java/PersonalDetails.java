
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, helperLength = 0;
        String longestName = "";
        while (true) {
            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            }

            String[] pieces = text.split(",");
            sum += Integer.valueOf(pieces[1]);
            count++;
            if (helperLength < pieces[0].length()) {
                helperLength = pieces[0].length();
                longestName = pieces[0];
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: "+1.0*sum/count);

    }
}
