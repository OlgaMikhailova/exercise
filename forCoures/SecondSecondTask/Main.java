package SecondSecondTask;
//Создать класс Park с внутренним классом,
// с помощью объектов которого можно хранить информацию
// об аттракционах, времени их работы и стоимости
public class Main {
    public static void main(String[] args){
        Attraction attraction = new Attraction(23," ",24);
        WorkTime workTime = new WorkTime("31.10.2018","9:00","16:00");
        Cashbox cashbox = new Cashbox(Cashbox.AgeGroup.Adult,23);
        Park park = new Park(attraction,workTime,cashbox);
    }
}
