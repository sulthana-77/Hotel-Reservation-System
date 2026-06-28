public class TestBooking {

    public static void main(String[] args) {

        BookingDAO bookingDAO = new BookingDAO();

        bookingDAO.addBooking(
                "B101",
                101,
                "Sulthana",
                "9876543210"
        );
    }
}
