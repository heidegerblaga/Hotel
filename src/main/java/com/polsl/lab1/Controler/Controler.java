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
 * This class contains methods for managing accommodations and performing various tasks.
 *
 * @author Pawel Pluta
 */
public class Controler  {
    
    /**
     * Method to append text to a file.
     *
     * @param fileName The name of the file to append to.
     * @param textToAppend The text to append to the file.
     */
    public  void save(String fileName, String textToAppend) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true); // Set 'true' for append mode

            fileWriter.write(textToAppend);
            fileWriter.write(System.lineSeparator()); // Add a newline separator
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to read and print the contents of a file.
     *
     * @param filePath The path of the file to read and print.
     */
    public  void read(String filePath) {
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
    
    /**
     * Method to create a new client object and input their details.
     *
     * @return A new Client object with user input details.
     */
    public  Client newClient() {
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

    /**
     * Method to convert a string to an integer.
     *
     * @param x The string to convert to an integer.
     * @return The integer converted from the string. Returns 0 if the conversion fails.
     */
    public  Integer toInt(String x) {
        int number = 0;
        try {
            number = Integer.parseInt(x);
        } catch (NumberFormatException e) {
            System.out.println("This is not a number.");
        }
        return number;
    }

    /**
     * Method to load rooms from a file into a list.
     *
     * @return A list of Room objects loaded from the file.
     */
    public List<Room> loadRooms() {
        
        Room rooms = new Room();
       
        
        

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
                    rooms.roomList.add(room);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Not found: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
        for (Room element : rooms.roomList) {
            
        System.out.println(element.getNo() + " " + element.getStandard());
        
        }

        return rooms.roomList;
    }

    /**
     * Method to retrieve a specific room from the list by its number.
     *
     * @param number The number of the room to retrieve.
     * @return The Room object with the specified number.
     */
    public  Room showRoom(Integer number) {
        Controler controller = new Controler();
        List<Room> rooms = controller.loadRooms();
        return rooms.get(number - 2);
    }

    /**
     * Method to check if a value is a boolean (0 or 1).
     *
     * @param x The value to check.
     * @return True if the value is 0 or 1, false otherwise.
     */
    public  boolean boolCheck(Integer x) {
        if (x == 0 || x == 1) {
            return true;
        } else {
            System.out.println("Not a boolean value, please try again.");
            return false;
        }
    }
}
