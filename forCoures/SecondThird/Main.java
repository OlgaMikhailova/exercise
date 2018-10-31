package SecondThird;


public class Main {
    public static void main(String[] args){
        Cinema cinema;
        Film film = new Film(34,"Charming","Comedy, Family, Animation",90,2018);
        DateAndTime dateAndTime =new DateAndTime("31.10.2018","12:00");
        Room room = new Room(3,200);
        Session session  = new Session(dateAndTime,film,room);
        ContactInformation contactInformation = new ContactInformation("Kosmos",2,"Grodno Gorkogo","asd@mail",453214);
        cinema =new Cinema(session,contactInformation);
    }
}
