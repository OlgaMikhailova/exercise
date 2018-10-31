package FirstThirdTask;

import java.util.Scanner;

public class Input {
    public static int Scanner(int index){
       System.out.printf("Enter " +index +" number \n");
       Scanner scanner = new Scanner(System.in);
       return scanner.nextInt();
    }
}
