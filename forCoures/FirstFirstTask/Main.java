package FirstFirstTask;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String string = InputText.Scanner();
        List<String> stringList = new ArrayList<>(Arrays.asList(Splitter.TextSplitter(string)));
        System.out.println("Number of words " + CoutingNumber.Words(stringList));
        Collections.sort(stringList);
        Output.OnScreen(stringList);
    }
}
