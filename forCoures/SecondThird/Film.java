package SecondThird;

public class Film {
    private int id;
    private String title;
    private String genre;
    private int duration;
    private int year;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Film(int id, String title, String genre, int duration, int year){
        this.duration = duration;
        this.id = id;
        this.genre = genre;
        this.title = title;
        this.year = year;
    }
}
