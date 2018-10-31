package SecondSecondTask;

public class WorkTime {
    private String date;
    private String beginningTime;
    private String endingTime;

    public String getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(String endingTime) {
        this.endingTime = endingTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBeginningTime() {
        return beginningTime;
    }

    public void setBeginningTime(String beginningTime) {
        this.beginningTime = beginningTime;
    }
    public WorkTime(String date, String beginningTime, String endingTime){
        this.beginningTime = beginningTime;
        this.date = date;
        this.endingTime = endingTime;
    }
}
