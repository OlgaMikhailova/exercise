package SecondSecondTask;

public class Cashbox {
    private int price;
    private AgeGroup ageGroup;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }
    public Cashbox(AgeGroup ageGroup, int price){
        this.ageGroup = ageGroup;
        this.price = price;
    }
    public enum AgeGroup{
        Adult,Teenager,Kid,
    }
}
