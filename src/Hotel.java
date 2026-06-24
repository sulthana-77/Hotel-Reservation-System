public class Hotel {

    Room[] rooms;

    public Hotel() {

        rooms = new Room[3];

        rooms[0] = new Room(101, "Single", 1500);
        rooms[1] = new Room(102, "Double", 2500);
        rooms[2] = new Room(103, "Deluxe", 4000);
    }

    public void viewRooms() {

    System.out.println("\nAvailable Rooms:");

    for (int i = 0; i < rooms.length; i++) {

        System.out.println(
    "Room No: " + rooms[i].roomNumber +
    " | Type: " + rooms[i].roomType +
    " | Price: ₹" + rooms[i].price +
    " | Booked: " + rooms[i].isBooked +
    " | Customer: " + rooms[i].customerName +
    " | Phone: " + rooms[i].phoneNumber +
    " | Booking ID: " + rooms[i].bookingId
);
    }
}

    public void bookRoom(int roomNo, String customerName, String phoneNumber) {

        boolean found = false;

        for (int i = 0; i < rooms.length; i++) {

            if (rooms[i].roomNumber == roomNo) {

                found = true;

                if (!rooms[i].isBooked) {

                   rooms[i].isBooked = true;
                   rooms[i].customerName = customerName;
                   rooms[i].bookingId = "B" + rooms[i].roomNumber;
                   rooms[i].phoneNumber = phoneNumber;
                   BookingFileManager.saveBooking(
        rooms[i].bookingId,
        rooms[i].roomNumber,
        customerName,
        phoneNumber
);
                    System.out.println("Room booked successfully!");
                    System.out.println("Customer Name: " + customerName);
                    System.out.println("Phone Number: " + phoneNumber);
                    System.out.println("Booking ID: " + rooms[i].bookingId);

                } else {

                    System.out.println("Room is already booked!");
                }

                break;
            }
        }

        if (!found) {
            System.out.println("Invalid room number!");
        }
    }

    public void cancelBooking(int roomNo) {

    boolean found = false;

    for (int i = 0; i < rooms.length; i++) {

        if (rooms[i].roomNumber == roomNo) {

            found = true;

            if (rooms[i].isBooked) {

                rooms[i].isBooked = false;
                rooms[i].customerName = "";
                rooms[i].bookingId = "";

                System.out.println("Booking cancelled successfully!");

            } else {

                System.out.println("Room is not currently booked!");
            }

            break;
        }
    }

    if (!found) {
        System.out.println("Invalid room number!");
    }
}

    public void searchRoom(int roomNo) {

        boolean found = false;

        for (int i = 0; i < rooms.length; i++) {

            if (rooms[i].roomNumber == roomNo) {

                found = true;

                System.out.println(
                    "Room No: " + rooms[i].roomNumber +
                    " | Type: " + rooms[i].roomType +
                    " | Price: ₹" + rooms[i].price +
                    " | Booked: " + rooms[i].isBooked +
                    " | Customer: " + rooms[i].customerName
                );

                break;
            }
        }

        if (!found) {
            System.out.println("Room not found!");
        }
    }
}