package FirstFirstTask;

public class Splitter {
    public  static String[] TextSplitter(String string){
        String[] array = string.split(" +|,");
        return array;
    }
}
