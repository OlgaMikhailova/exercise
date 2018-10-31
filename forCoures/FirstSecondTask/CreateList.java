package FirstSecondTask;

import java.util.ArrayList;
import java.util.List;

public class CreateList {
    public static List<Integer> EvenNumbers(int n){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i += 2){
            numbers.add(i);
        }
        return numbers;
    }
}
