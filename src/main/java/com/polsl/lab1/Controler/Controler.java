package com.polsl.lab1.Controler;

import java.io.*;
import com.polsl.lab1.Models.Client;
import java.util.Scanner;
import com.polsl.lab1.Models.Room;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawel Pluta
 */


public class Controler {
    
    // Method to append text to a file
    public static void save(String fileName, String textToAppend) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true); // Set 'true' for append mode

            fileWriter.write(textToAppend);
            fileWriter.write(System.lineSeparator()); // Add a newline separator
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read and print the contents of a file
    public static void read(String filePath) {
        try {
            // Create a FileReader object for file reading
            FileReader fileReader = new FileReader(filePath);

            // Create a BufferedReader object for efficient reading
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the streams
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Method to create a new client object and input their details
    public static Client newClient() {
        Scanner scanner = new Scanner(System.in);
        Client newClient = new Client();

        System.out.print("Client name: ");
        newClient.setName(scanner.nextLine());

        System.out.print("Client surname: ");
        newClient.setSurname(scanner.nextLine());

        System.out.print("Client age: ");
        newClient.setAge(toInt(scanner.nextLine()));

        System.out.print("Client mail: ");
        newClient.setMaill(scanner.nextLine());

        System.out.print("Client id: ");
        newClient.setId(toInt(scanner.nextLine()));

        System.out.print("Client phone number: ");
        newClient.setPhoneNo(toInt(scanner.nextLine()));

        return newClient;
    }

    // Method to convert a string to an integer
    public static Integer toInt(String x) {
        int number = 0;
        try {
            number = Integer.parseInt(x);
        } catch (NumberFormatException e) {
            System.out.println("This is not a number.");
        }
        return number;
    }

    // Method to load rooms from a file into a list
    public List<Room> loadRooms() {
        List<Room> rooms = new ArrayList<>();

        try {
            File file = new File("Room.txt");
            Scanner scanner = new Scanner(file);

            // Skipping the first line (headers)
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                if (data.length == 4) {
                    Room room = new Room();
                    room.setNo(toInt(data[0]));
                    room.setLvl(toInt(data[1]));
                    room.setCapacity(toInt(data[3]));
                    rooms.add(room);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Not found: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
         for (Room element : rooms) {
            System.out.println(element.getNo() + " " + element.getStandard().toString());
        }

        return rooms;
    }

    // Method to retrieve a specific room from the list by its number
    public static Room showRoom(Integer number) {
        Controler controller = new Controler();
        List<Room> rooms = controller.loadRooms();
        return rooms.get(number-2);
    }

    // Method to check if a value is a boolean (0 or 1)
    public static boolean boolCheck(Integer x) {
        if (x == 0 || x == 1) {
            return true;
        } else {
            System.out.println("Not a boolean value, please try again.");
            return false;
        }
    }
}

    
 
