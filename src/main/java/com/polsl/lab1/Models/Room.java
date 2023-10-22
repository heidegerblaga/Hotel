/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polsl.lab1.Models;

/**
 *
 * @author Pawel Pluta
 */

/**
 * Class representing a room object.
 */
public class Room {
    
    Integer no;                        // Field for storing the room number
    Integer lvl;                       // Field for storing the room level
    String[] standard = {"Apartment","Luxury","Family","Economy"};  // Array of room standard options (for future development purpose)
    Integer Capacity;                  // Field for storing the room capacity

    public Integer getNo() {
        return no; // Returns the room number
    }

    public void setNo(Integer no) {
        this.no = no; // Sets the room number
    }

    public Integer getLvl() {
        return lvl; // Returns the room level
    }

    public void setLvl(Integer lvl) {
        this.lvl = lvl; // Sets the room level
    }

    public String[] getStandard() {
        return standard; // Returns the room standard options
    }

    public void setStandard(String[] standard) {
        this.standard = standard; // Sets the room standard options
    }

    public Integer getCapacity() {
        return Capacity; // Returns the room capacity
    }

    public void setCapacity(Integer Capacity) {
        this.Capacity = Capacity; // Sets the room capacity
    }
}

