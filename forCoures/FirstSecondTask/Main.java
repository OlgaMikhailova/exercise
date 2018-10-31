package FirstSecondTask;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int n = Input.Scanner();
        List<Integer> numbers = new ArrayList<>(CreateList.EvenNumbers(n));
        System.out.printf("Amount to 0 on "+ n +" = "+ Amount.OfElements(numbers)+"\n");
        Output.OnScreen(numbers);
    }
}
