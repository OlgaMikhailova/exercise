package FirstThirdTask;

import java.util.ArrayList;
import java.util.List;

public class ThreeDigitNumbers {
    public static List<Integer> Creating(){
        List<Integer> numbers = new ArrayList<>();
        int first = (Input.Scanner(1));
        int second = (Input.Scanner(2));
        int third = (Input.Scanner(3));
        numbers.add(CreatingNumber(first,second,third));
        if(second != third){
            numbers.add(CreatingNumber(first,third,second));
        }
        if (first != second){
            numbers.add(CreatingNumber(second,third,first));
        }
        if(first != second && first != third) {
            numbers.add(CreatingNumber(second,first,third));
        }
        if(first != third && second != third){
            numbers.add(CreatingNumber(third,first,second));
        }
        if(first != second && first != third && second != third){
            numbers.add(CreatingNumber(third,second,first));
        }
       return numbers;
    }
    public static int CreatingNumber(int a, int b,int c){
        return a*100 + b*10 + c;
    }
}
