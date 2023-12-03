package com.polsl.lab1.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a room object.
 *
 * This class represents a room and provides methods to access and modify room information.
 *
 * @author Paweł Pluta
 */
public class Room {

    /**
     * Enum for room standard options.
     */
    public enum Standard {
        Apartment, Luxury, Family, Economy
    }

    private Integer no; // Field for storing the room number
    private Integer lvl; // Field for storing the room level
    private Standard standard; // Field for storing the room standard
    private Integer capacity; // Field for storing the room capacity

    public List<Room> roomList = new ArrayList<>();

    /**
     * Constructor for the Room class.
     */
    public Room() {
        // Initialize the list if needed
    }

    /**
     * Add a room to the list of rooms.
     *
     * @param room The room to add to the list of rooms.
     */
    public void addRoom(Room room) {
        roomList.add(room);
    }

    /**
     * Get the list of rooms.
     *
     * @return The list of room objects.
     */
    public List<Room> getRoomList() {
        return roomList;
    }

    /**
     * Get the room number.
     *
     * @return The room number.
     */
    public Integer getNo() {
        return no;
    }

    /**
     * Set the room number.
     *
     * @param no The new room number to set for the room.
     */
    public void setNo(Integer no) {
        this.no = no;
    }

    /**
     * Get the room level.
     *
     * @return The room level.
     */
    public Integer getLvl() {
        return lvl;
    }

    /**
     * Set the room level.
     *
     * @param lvl The new room level to set for the room.
     */
    public void setLvl(Integer lvl) {
        this.lvl = lvl;
    }

    /**
     * Get the room standard.
     *
     * @return The room standard.
     */
    public Standard getStandard() {
        return standard;
    }

    /**
     * Set the room standard.
     *
     * @param standard The new room standard to set for the room.
     */
    public void setStandard(String standard) {
        // Konwersja ciągu znaków na wartość enuma
        this.standard = Standard.valueOf(standard.trim());
    }

    /**
     * Get the room capacity.
     *
     * @return The room capacity.
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * Set the room capacity.
     *
     * @param capacity The new room capacity to set for the room.
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
