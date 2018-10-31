package FirstThirdTask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>(ThreeDigitNumbers.Creating());
        Output.OnScreen(numbers);
    }
}
