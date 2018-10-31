package FirstSecondTask;

import java.util.List;

public class Amount {
    public static int OfElements(List<Integer> integerList){
        int sum = 0;
        for (Integer integer : integerList){
            sum += integer;
        }
        return sum;
    }
}
