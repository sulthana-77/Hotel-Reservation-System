import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== HOTEL RESERVATION SYSTEM =====");
        System.out.println("1. View Rooms");
        System.out.println("2. Book Room");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.println("You selected option: " + choice);

        sc.close();
    }
}