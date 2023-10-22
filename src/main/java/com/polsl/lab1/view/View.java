/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.polsl.lab1.view;
import com.polsl.lab1.Controler.Controler;
import java.util.Scanner;
import com.polsl.lab1.Models.Client;
import com.polsl.lab1.Models.Room;
import com.polsl.lab1.Models.Accomodation;

/**
 *
 * @author Pawel Pluta
 */

public class View {
    static Controler start;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Accommodation manager\n");
        System.out.print("1. Add new accommodation\n");
        System.out.print("2. Exit\n\n");

        String choice = scanner.nextLine();

        int number = start.toInt(choice);

        if (number == 1) {
            Client newClient = start.newClient();

            System.out.println("Choose a room (Number, level, standard, capacity): ");

            start.read("Room.txt");

            Integer roomChoice = start.toInt(scanner.nextLine());
            Room match = start.showRoom(roomChoice);

            Accomodation newAcc = new Accomodation();
            newAcc.setClient(newClient);
            newAcc.setRoom(match);

            System.out.println("Breakfast? 0 - no, 1 - yes: ");
            Integer breakfast = start.toInt(scanner.nextLine());

            if (start.boolCheck(breakfast)) {
                newAcc.setBreakfast(breakfast);
            }

            System.out.println("Lunch? 0 - no, 1 - yes: ");
            Integer lunch = start.toInt(scanner.nextLine());

            if (start.boolCheck(lunch)) {
                newAcc.setLunch(lunch);
            }

            System.out.println("Dinner? 0 - no, 1 - yes: ");
            Integer dinner = start.toInt(scanner.nextLine());

            if (start.boolCheck(dinner)) {
                newAcc.setDinner(dinner);
            }

            System.out.println("SPA? 0 - no, 1 - yes: ");
            Integer spa = start.toInt(scanner.nextLine());

            if (start.boolCheck(spa)) {
                newAcc.setSpa(spa);
            }

            String info = "Client: " + newAcc.getClient().getName() + " " + newAcc.getClient().getSurname() + "\n" 
                         + "Room No: " + newAcc.getRoom().getNo() + "\n" 
                         + "Email: " + newAcc.getClient().getMaill() + "\n" 
                         + "Phone No: " + newAcc.getClient().getPhoneNo() + "\n" 
                         + "Breakfast: " + newAcc.getBreakfast() + "\n" 
                         + "Lunch: " + newAcc.getLunch() + "\n" 
                         + "Dinner: " + newAcc.getDinner() + "\n" 
                         + "SPA: " + newAcc.getSpa() + "\n ____________________";

            start.save("AccommodationData.txt", info);
            
            
        } else if (number == 2) {
            System.exit(0);
        }
    }
}

