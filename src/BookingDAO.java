import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookingDAO {

    public void addBooking(String bookingId, int roomNo,
                           String customerName, String phoneNumber) {

        String query = "INSERT INTO bookings (booking_id, room_no, customer_name, phone_number) VALUES (?, ?, ?, ?)";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, bookingId);
            ps.setInt(2, roomNo);
            ps.setString(3, customerName);
            ps.setString(4, phoneNumber);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Booking saved to MySQL successfully!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
