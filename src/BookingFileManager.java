import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class BookingFileManager {

    public static void saveBooking(
            String bookingId,
            int roomNo,
            String customerName,
            String phoneNumber) {

        try {

            FileWriter writer =
                    new FileWriter("bookings.txt", true);

            writer.write(
                    bookingId + "," +
                    roomNo + "," +
                    customerName + "," +
                    phoneNumber + "\n"
            );

            writer.close();

        } catch (IOException e) {

            System.out.println("Error saving booking!");
        }
    }

public static void viewBookings() {

    try {

        BufferedReader reader =
                new BufferedReader(
                        new FileReader("bookings.txt"));

        String line;

        System.out.println("\n===== SAVED BOOKINGS =====");

        while ((line = reader.readLine()) != null) {

            System.out.println(line);
        }

        reader.close();

    } catch (IOException e) {

        System.out.println("No bookings found!");
    }
}
}