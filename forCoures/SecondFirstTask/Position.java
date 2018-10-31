package SecondFirstTask;

import java.util.Date;

public class Position {
    private int id;
    private String name;
    private Date appointment;
    private String condition;
//    work,dismissed,transferred

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcondition() {
        return condition;
    }

    public void setcondition(String condition) {
        this.condition = condition;
    }

    public Date getAppointment() {
        return appointment;
    }

    public void setAppointment(Date appointment) {
        this.appointment = appointment;
    }
    public Position(int id, String name, Date appointment, String condition){
        this.appointment = appointment;
        this.condition = condition;
        this.id = id;
        this.name = name;
    }
}
