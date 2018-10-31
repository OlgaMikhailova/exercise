package SecondFirstTask;

import java.text.SimpleDateFormat;
import java.util.Date;
import static java.util.Date.parse;

public class Main {
    public static void main(String[] args){
        Department department;
        Men men = new Men(1,"Ivan","Ivanovich","Ivanov");
        ContactInformation contactInformation = new ContactInformation("wer@gmail",2345);
        StatusEmployee statusEmployee = new StatusEmployee(StatusEmployee.Status.WORK);
        Worker worker = new Worker(men,contactInformation,statusEmployee);
        Date date = new Date("12.07.2016");
        Position position = new Position(1,"HP",date,"work");
        department = new Department(position,worker);
    }
}
