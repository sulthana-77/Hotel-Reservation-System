import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Room room1 = new Room(101, "Single");
        Room room2 = new Room(102, "Double");
        Room room3 = new Room(103, "Deluxe");

        System.out.println("===== HOTEL RESERVATION SYSTEM =====");
        System.out.println("1. View Rooms");
        System.out.println("2. Book Room");
        System.out.println("3. Cancel Booking");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
    System.out.println("\nAvailable Rooms:");

    System.out.println(room1.roomNumber + " - " + room1.roomType + " - Booked: " + room1.isBooked);
    System.out.println(room2.roomNumber + " - " + room2.roomType + " - Booked: " + room2.isBooked);
    System.out.println(room3.roomNumber + " - " + room3.roomType + " - Booked: " + room3.isBooked);

} else if (choice == 2) {

    System.out.print("Enter room number (101, 102, 103): ");
    int roomNo = sc.nextInt();

    if (roomNo == 101) {
        if (!room1.isBooked) {
            room1.isBooked = true;
            System.out.println("Room 101 booked successfully!");
        } else {
            System.out.println("Room 101 is already booked!");
        }
    }
    else if (roomNo == 102) {
        if (!room2.isBooked) {
            room2.isBooked = true;
            System.out.println("Room 102 booked successfully!");
        } else {
            System.out.println("Room 102 is already booked!");
        }
    }
    else if (roomNo == 103) {
        if (!room3.isBooked) {
            room3.isBooked = true;
            System.out.println("Room 103 booked successfully!");
        } else {
            System.out.println("Room 103 is already booked!");
        }
    }

} else if (choice == 3) {

    System.out.print("Enter room number to cancel booking: ");
    int roomNo = sc.nextInt();

    if (roomNo == 101) {
        room1.isBooked = false;
        System.out.println("Booking cancelled for Room 101");
    } else if (roomNo == 102) {
        room2.isBooked = false;
        System.out.println("Booking cancelled for Room 102");
    } else if (roomNo == 103) {
        room3.isBooked = false;
        System.out.println("Booking cancelled for Room 103");
    } else {
        System.out.println("Invalid room number!");
    }

} else if (choice == 4) {
    System.out.println("Thank you for using Hotel System!");
}

        sc.close();
    }
}