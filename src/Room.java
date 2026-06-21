public class Room {

    int roomNumber;
    String roomType;
    boolean isBooked;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isBooked = false;
    }
}