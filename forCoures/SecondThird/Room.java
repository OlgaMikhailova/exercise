package SecondThird;

public class Room {
    private int numberOfRoom;
    private int namberOfSeats;

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNamberOfSeats() {
        return namberOfSeats;
    }

    public void setNamberOfSeats(int namberOfSeats) {
        this.namberOfSeats = namberOfSeats;
    }
    public  Room(int numberOfRoom, int namberOfSeats){
        this.namberOfSeats = namberOfSeats;
        this.numberOfRoom = numberOfRoom;
    }
}
