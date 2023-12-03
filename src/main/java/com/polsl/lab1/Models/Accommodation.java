package com.polsl.lab1.Models;

/**
 * Class representing an accommodation object.
 *
 * This class represents an accommodation and provides methods to access and modify accommodation information.
 *
 * @author Paweł Pluta
 */
public class Accommodation {

    /**
     * Field for storing the client associated with the accommodation.
     */
    private Client client;

    /**
     * Field for storing the room associated with the accommodation.
     */
    private Room room;

    /**
     * Field for storing the number of dinners included in the accommodation.
     */
    private Integer dinner;

    /**
     * Field for storing the number of breakfasts included in the accommodation.
     */
    private Integer breakfast;

    /**
     * Field for storing the number of lunches included in the accommodation.
     */
    private Integer lunch;

    /**
     * Field for storing the spa services included in the accommodation.
     */
    private Integer spa;


    /**
     * Constructor for the Accommodation class.
     *
     * @param client    The client associated with the accommodation.
     * @param room      The room associated with the accommodation.
     * @param dinner    The number of dinners included in the accommodation.
     * @param breakfast The number of breakfasts included in the accommodation.
     * @param lunch     The number of lunches included in the accommodation.
     * @param spa       The spa services included in the accommodation.
     */
    public Accommodation(Client client, Room room, Integer dinner, Integer breakfast, Integer lunch, Integer spa) {
        this.client = client;
        this.room = room;
        this.dinner = dinner;
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.spa = spa;
    }
    /**
     * Get the client associated with the accommodation.
     *
     * @return The client associated with the accommodation.
     */
    public Client getClient() {
        return client;
    }

    /**
     * Set the client associated with the accommodation.
     *
     * @param client The new client to set for the accommodation.
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Get the room associated with the accommodation.
     *
     * @return The room associated with the accommodation.
     */
    public Room getRoom() {
        return room;
    }

    /**
     * Set the room associated with the accommodation.
     *
     * @param room The new room to set for the accommodation.
     */
    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * Get the number of dinners included in the accommodation.
     *
     * @return The number of dinners included.
     */
    public Integer getDinner() {
        return dinner;
    }

    /**
     * Set the number of dinners included in the accommodation.
     *
     * @param dinner The new number of dinners to set for the accommodation.
     */
    public void setDinner(Integer dinner) {
        this.dinner = dinner;
    }

    /**
     * Get the number of breakfasts included in the accommodation.
     *
     * @return The number of breakfasts included.
     */
    public Integer getBreakfast() {
        return breakfast;
    }

    /**
     * Set the number of breakfasts included in the accommodation.
     *
     * @param breakfast The new number of breakfasts to set for the accommodation.
     */
    public void setBreakfast(Integer breakfast) {
        this.breakfast = breakfast;
    }

    /**
     * Get the number of lunches included in the accommodation.
     *
     * @return The number of lunches included.
     */
    public Integer getLunch() {
        return lunch;
    }

    /**
     * Set the number of lunches included in the accommodation.
     *
     * @param lunch The new number of lunches to set for the accommodation.
     */
    public void setLunch(Integer lunch) {
        this.lunch = lunch;
    }

    /**
     * Get the spa services included in the accommodation.
     *
     * @return The spa services included in the accommodation.
     */
    public Integer getSpa() {
        return spa;
    }

    /**
     * Set the spa services included in the accommodation.
     *
     * @param spa The new spa services to set for the accommodation.
     */
    public void setSpa(Integer spa) {
        this.spa = spa;
    }


}
