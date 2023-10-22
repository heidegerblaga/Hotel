/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polsl.lab1.Models;

/**
 *
 * @author Paweł Pluta
 */
/**
 * Class representing an accommodation object.
 */
public class Accomodation  {
    
    Client client;       // Field for storing the client associated with the accommodation
    Room room;           // Field for storing the room associated with the accommodation
    Integer dinner;      // Field for storing the number of dinners included
    Integer breakfast;   // Field for storing the number of breakfasts included
    Integer lunch;       // Field for storing the number of lunches included
    Integer spa;         // Field for storing the spa services included

    public Client getClient() {
        return client; // Returns the client associated with the accommodation
    }

    public void setClient(Client client) {
        this.client = client; // Sets the client associated with the accommodation
    }

    public Room getRoom() {
        return room; // Returns the room associated with the accommodation
    }

    public void setRoom(Room room) {
        this.room = room; // Sets the room associated with the accommodation
    }

    public Integer getDinner() {
        return dinner; // Returns the number of dinners included
    }

    public void setDinner(Integer dinner) {
        this.dinner = dinner; // Sets the number of dinners included
    }

    public Integer getBreakfast() {
        return breakfast; // Returns the number of breakfasts included
    }

    public void setBreakfast(Integer breakfast) {
        this.breakfast = breakfast; // Sets the number of breakfasts included
    }

    public Integer getLunch() {
        return lunch; // Returns the number of lunches included
    }

    public void setLunch(Integer lunch) {
        this.lunch = lunch; // Sets the number of lunches included
    }

    public Integer getSpa() {
        return spa; // Returns the spa services included
    }

    public void setSpa(Integer spa) {
        this.spa = spa; // Sets the spa services included
    }
}
