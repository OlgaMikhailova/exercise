package SecondThird;

public class DateAndTime {
    private String dateSession;
    private String timeSession;

    public String getTimeSession() {
        return timeSession;
    }

    public void setTimeSession(String timeSession) {
        this.timeSession = timeSession;
    }
    public String getDateSession() {
        return dateSession;
    }

    public void setDateSession(String dateSession) {
        this.dateSession = dateSession;
    }
    public DateAndTime(String dateSession, String timeSession){
        this.dateSession = dateSession;
        this.timeSession = timeSession;
    }
}
