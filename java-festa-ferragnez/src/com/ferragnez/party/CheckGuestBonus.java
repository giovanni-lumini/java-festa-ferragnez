package com.ferragnez.party;

//scanner per leggere da tastiera/console
import java.util.Scanner;

public class CheckGuestBonus {
    public static void main(String[] args) {

        String[] arrayGuest = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi",
                "Bebe Bio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic", };

        // scanner per leggere da tastiera/console
        Scanner input = new Scanner(System.in);
        System.out.println("Scrivi il nome che vuoi cercare nella lista:");
        String userGuest = input.nextLine();

        boolean guestFound = false;
        int i = 0;
        while (!guestFound && i < arrayGuest.length) {
            if (arrayGuest[i].toLowerCase().equals(userGuest.toLowerCase())) {
                guestFound = true;
                break;
            } else {
                i++;
            }
        }

        // stampo in console quanto risulta dal ciclo for
        if (guestFound) {
            System.out.println("Il nome " + userGuest + " è presente nella lista");
        } else {
            System.out.println("Il nome " + userGuest + " non è presente nella lista");
        }
        input.close();
    }
}
