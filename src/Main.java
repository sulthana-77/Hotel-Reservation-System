import java.util.Scanner;

public class Main {
    public static void viewRooms(Room[] rooms) {

    System.out.println("\nAvailable Rooms:");

    for (int i = 0; i < rooms.length; i++) {

        System.out.println(
            rooms[i].roomNumber + " - " +
            rooms[i].roomType + " - Booked: " +
            rooms[i].isBooked +
            " - Customer: " +
            rooms[i].customerName
        );
    }
}
    public static void searchRoom(Room[] rooms, int roomNo) {

    boolean found = false;

    for (int i = 0; i < rooms.length; i++) {

        if (rooms[i].roomNumber == roomNo) {

            found = true;

            System.out.println(
                rooms[i].roomNumber + " - " +
                rooms[i].roomType + " - Booked: " +
                rooms[i].isBooked + " - Customer: " +
                rooms[i].customerName
            );

            break;
        }
    }

    if (!found) {
        System.out.println("Room not found!");
    }
}
    public static void bookRoom(Room[] rooms, int roomNo, String customerName) {

    boolean found = false;

    for (int i = 0; i < rooms.length; i++) {

        if (rooms[i].roomNumber == roomNo) {

            found = true;

            if (!rooms[i].isBooked) {

                rooms[i].isBooked = true;
                rooms[i].customerName = customerName;

                System.out.println(
                    "Room booked successfully for " + customerName + "!"
                );

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
public static void cancelBooking(Room[] rooms, int roomNo) {

    boolean found = false;

    for (int i = 0; i < rooms.length; i++) {

        if (rooms[i].roomNumber == roomNo) {

            found = true;

            if (rooms[i].isBooked) {

                rooms[i].isBooked = false;
                rooms[i].customerName = "";

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
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        Room[] rooms = hotel.rooms;

        System.out.println("===== HOTEL RESERVATION SYSTEM =====");
        while (true) {
      System.out.println("1. View Rooms");
System.out.println("2. Book Room");
System.out.println("3. Cancel Booking");
System.out.println("4. Search Room");
System.out.println("5. View Saved Bookings");
System.out.println("6. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
     if (choice == 1) {
    hotel.viewRooms();
} else if (choice == 2) {

    System.out.print("Enter room number (101, 102, 103): ");
    int roomNo = sc.nextInt();

   System.out.print("Enter customer name: ");
   String customerName = sc.next();
   String phoneNumber;

while (true) {

    System.out.print("Enter phone number: ");
    phoneNumber = sc.next();

    if (phoneNumber.length() == 10) {
        break;
    }

    System.out.println("Phone number must be 10 digits!");
}
   hotel.bookRoom(roomNo, customerName, phoneNumber);
} else if (choice == 3) {

    System.out.print("Enter room number to cancel booking: ");
    int roomNo = sc.nextInt();

    hotel.cancelBooking(roomNo);
} else if (choice == 4) {

    System.out.print("Enter room number to search: ");
    int roomNo = sc.nextInt();
    hotel.searchRoom(roomNo);
    
}
else if (choice == 5) {

    BookingFileManager.viewBookings();
}
else if (choice == 6) {

    System.out.println("Thank you for using Hotel Reservation System!");
    break;
}
        }
        sc.close();

    }
}