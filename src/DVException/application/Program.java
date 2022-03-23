package DVException.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import DVException.entities.Reservation;
import DVException.model.DomainException;

public class Program {
	public static void main(String[] args){
        try {
	
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room Number: ");
		int number = entrada.nextInt();
		System.out.print("Check-in date (dd/mm/yyyy): ");
		Date checkIn = simpleDate.parse(entrada.next());
		System.out.print("Check-Out date (dd/mm/yyyy): ");
		Date checkOut = simpleDate.parse(entrada.next());

		Reservation reservation = new Reservation(number, checkIn, checkOut);
		System.out.print(reservation);
		
		System.out.println();
		System.out.println("Enter data to update the reservation: ");
		System.out.print("Check-in date (dd/mm/yyyy): ");
		checkIn = simpleDate.parse(entrada.next());
		System.out.print("Check-Out date (dd/mm/yyyy): ");
		checkOut = simpleDate.parse(entrada.next());

		reservation.updateDates(checkIn, checkOut);
		System.out.println(reservation);
		entrada.close();
        }catch(ParseException | DomainException e) {
        	System.err.print("Erro Reservation: " + e.getMessage());
        }
        

	}
}
