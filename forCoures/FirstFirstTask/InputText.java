package FirstFirstTask;

import java.util.Scanner;

public class InputText {
    public static String Scanner(){
        System.out.printf("Enter text \n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
