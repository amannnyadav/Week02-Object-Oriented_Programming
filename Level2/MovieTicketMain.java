class MovieTicket{
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    public MovieTicket(String movieName,String seatNumber,double price){
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.price=price;
    }

    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName + " | Seat: " + seatNumber + " | Price: $" + price);
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
        }
    }
    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Status: " + (isBooked ? "Booked" : "Available"));
        System.out.println("------------------------------");
    }
   
}
public class MovieTicketMain {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Inception", "A10", 12.99);
        MovieTicket ticket2 = new MovieTicket("Interstellar", "B15", 14.99);
       
        ticket1.displayTicketDetails();
        ticket2.displayTicketDetails();
       
        ticket1.bookTicket();
        ticket2.bookTicket();
        ticket1.bookTicket();
       
        ticket1.displayTicketDetails();
        ticket2.displayTicketDetails();
    }
}


