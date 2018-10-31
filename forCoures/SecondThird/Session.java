package SecondThird;

public class Session {
 Film film;
 DateAndTime dateAndTime;
 Room room;
 Session(DateAndTime dateAndTime, Film film, Room room){
     this.dateAndTime = dateAndTime;
     this.film = film;
     this.room = room;
 }
}
