public class BookingRequest implements Runnable {

    String bookingRequests;

    BookingRequest(String bookingRequests) {
        this.bookingRequests = bookingRequests;
    }

    void bookingReqRecieved() {

        System.out.println(" Booking request recieved from " + this.bookingRequests);
    }

    void paymentProcessed() {
        System.out.println(" Payment Processed for " + this.bookingRequests);
    }

    void ticketCnnfirmed() {
        System.out.println(" ticket confirmed for  " + this.bookingRequests);
    }

    @Override
    public void run() {

        System.out.println(bookingRequests + " is here and his ID is " + Thread.currentThread().getName());
        bookingReqRecieved();
        paymentProcessed();
        ticketCnnfirmed();
    }
}
