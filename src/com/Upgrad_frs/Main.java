package com.Upgrad_frs;

public class Main {

    public static void main(String[] args) {

        Ticket regularTicket = new RegularTicket("4A89C7", "Bangalore", "Uk", null, "DepartureDateTime", "ArrivalDateTime", null, 50000, false, "4A", "lunch");
        Ticket touristTicket = new TouristTicket("56AB47", "Chennai", "Delhi", null, "DepartureDateTime", "ArrivalDateTime", null, 100000, false, "1B", "uae Resort", new String[]{" "});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }
}
