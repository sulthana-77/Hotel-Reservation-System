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
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
    System.out.println("\nAvailable Rooms:");
    
    System.out.println(room1.roomNumber + " - " + room1.roomType + " - Booked: " + room1.isBooked);
    System.out.println(room2.roomNumber + " - " + room2.roomType + " - Booked: " + room2.isBooked);
    System.out.println(room3.roomNumber + " - " + room3.roomType + " - Booked: " + room3.isBooked);
   }
   else if (choice == 2) {
    room1.isBooked = true;
    System.out.println("Room 101 booked successfully!");
   }

        sc.close();
    }
}