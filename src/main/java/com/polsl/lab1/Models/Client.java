package com.polsl.lab1.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a client object.
 *
 * This class represents a client and provides methods to access and modify client information.
 *
 * @author Paweł Pluta
 */
public class Client {
    
    /**
     * Field for storing the client's first name.
     */
    String name;
    
    /**
     * Field for storing the client's last name.
     */
    String surname;
    
    /**
     * Field for storing the client's age.
     */
    Integer age;
    
    /**
     * Field for storing the client's phone number.
     */
    Integer phoneNo;
    
    /**
     * Field for storing the client's ID.
     */
    Integer id;
    
    /**
     * Field for storing the client's email address.
     */
    String maill;

    // Create a list to store client objects
    private List<Client> clientList = new ArrayList<>();

    // Constructor for the Client class
    public Client() {
        // Initialize the list if needed
    }

    /**
     * Add a client to the list of clients.
     *
     * @param client The client object to be added to the list.
     */
    public void addClient(Client client) {
        clientList.add(client);
    }

    /**
     * Get the list of clients.
     *
     * @return The list of client objects.
     */
    public List<Client> getClientList() {
        return clientList;
    }

    /**
     * Get the client's first name.
     *
     * @return The first name of the client.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the client's first name.
     *
     * @param name The new first name to set for the client.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the client's last name.
     *
     * @return The last name of the client.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Set the client's last name.
     *
     * @param surname The new last name to set for the client.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Get the client's age.
     *
     * @return The age of the client.
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Set the client's age.
     *
     * @param age The new age to set for the client.
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Get the client's phone number.
     *
     * @return The phone number of the client.
     */
    public Integer getPhoneNo() {
        return phoneNo;
    }

    /**
     * Set the client's phone number.
     *
     * @param phoneNo The new phone number to set for the client.
     */
    public void setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * Get the client's ID.
     *
     * @return The ID of the client.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the client's ID.
     *
     * @param id The new ID to set for the client.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get the client's email address.
     *
     * @return The email address of the client.
     */
    public String getMaill() {
        return maill;
    }

    /**
     * Set the client's email address.
     *
     * @param maill The new email address to set for the client.
     */
    public void setMaill(String maill) {
        this.maill = maill;
    }
}
