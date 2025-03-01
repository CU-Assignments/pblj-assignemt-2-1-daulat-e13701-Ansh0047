class TicketBooking implements Runnable {
    private int seats = 10;

    public synchronized void bookTicket(String name, int seatsToBook) {
        if (seats >= seatsToBook) {
            System.out.println(name + " booked " + seatsToBook + " seat(s).");
            seats -= seatsToBook;
        } else {
            System.out.println("Not enough seats for " + name);
        }
    }

    public void run() {
        bookTicket(Thread.currentThread().getName(), 2);
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        Thread vip = new Thread(booking, "VIP");
        Thread user1 = new Thread(booking, "User1");
        Thread user2 = new Thread(booking, "User2");

        vip.setPriority(Thread.MAX_PRIORITY);
        user1.setPriority(Thread.NORM_PRIORITY);
        user2.setPriority(Thread.MIN_PRIORITY);

        vip.start();
        user1.start();
        user2.start();
    }
}
