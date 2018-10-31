package SecondSecondTask;

public class Attraction {
    private int id;
    private String title;
    private int nunberOfSeats;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNunberOfSeats() {
        return nunberOfSeats;
    }

    public void setNunberOfSeats(int nunberOfSeats) {
        this.nunberOfSeats = nunberOfSeats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Attraction(int id,String title,int nunberOfSeats){
        this.id = id;
        this.nunberOfSeats = nunberOfSeats;
        this.title = title;
    }
}
