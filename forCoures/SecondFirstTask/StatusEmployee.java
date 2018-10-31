package SecondFirstTask;

public class StatusEmployee {
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public StatusEmployee(Status status){
        this.status = status;
    }

    public enum Status{
        DISMISSED,WORK
    }
}
