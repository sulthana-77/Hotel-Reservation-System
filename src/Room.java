public class Room {

    int roomNumber;
    String roomType;
    double price;
    boolean isBooked;
    String customerName;
    String bookingId;
    String phoneNumber;

    public Room(int roomNumber, String roomType, double price) {

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isBooked = false;
        this.customerName = "";
        this.bookingId = "";
        this.phoneNumber = "";
    }
}