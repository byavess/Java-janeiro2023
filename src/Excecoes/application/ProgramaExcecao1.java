package Excecoes.application;

import Excecoes.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramaExcecao1 {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
          SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");

        int number = sc.nextInt();
        System.out.println("check-in data dd/MM/yyyy: ");
           Date checkIn = sdf.parse(sc.next());
        System.out.println("check-out data dd/MM/yyyy: ");
          Date checkOut = sdf.parse(sc.next());

          if (!checkOut.after(checkIn)) {
            System.out.println("erro saida antes da entrada");
        }
        else {
            Reservation reservation = new Reservation(number,checkIn,checkOut);
            System.out.println("Reservation: "+ reservation);

              System.out.println();
              System.out.println("Enter data to update the reservation: ");
              System.out.println("Check-in date (dd/MM/yyyy): ");
              checkIn = sdf.parse(sc.next());


              Date now = new Date();
              if (checkIn.before(now) || checkOut.before(now)){
                  System.out.println("Error reservation: reservation dates for update must be future");
              }
              else if (!checkOut.after(checkIn)) {
                  System.out.println("erro saida antes da entrada");

              }
              else {
                  reservation.updateDates(checkIn,checkOut);
                  System.out.println("Reservation: " + reservation);
              }

              reservation.updateDates(checkIn,checkOut);
              System.out.println("Reservation: "+ reservation);
        }
        sc.close();

    }
}
