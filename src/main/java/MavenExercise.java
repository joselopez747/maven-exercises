import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String input = scanner.nextLine();
        System.out.println("You entered: ");
        System.out.println(input);
        StringUtils.isNumeric(input);
        if (StringUtils.isNumeric(input)){
            System.out.println(input + " is a number!");
        } else {
            System.out.println(input + " is not a number!");
        }
    }
}
