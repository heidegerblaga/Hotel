package com.polsl.lab1.Models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

/**
 * Unit tests for the {@link Client} class.
 */
class ClientTest {

    /**
     * Tests the {@link Client#addClient(Client)} method.
     * Adds a client to the list and checks if it's present.
     */
    @ParameterizedTest
    @CsvSource({
            "John, Doe, 30, 123456789, 1, john.doe@example.com",
            "Jane, Doe, 25, 987654321, 2, jane.doe@example.com"
    })
    void testAddClient(String name, String surname, int age, int phoneNo, int id, String maill) {
        Client mainClient = new Client("John", "Doe", 30, 123456789, 1, "john.doe@example.com");
        Client clientToAdd = new Client(name, surname, age, phoneNo, id, maill);

        mainClient.addClient(clientToAdd);

        List<Client> clientList = mainClient.getClientList();
        Assertions.assertTrue(clientList.contains(clientToAdd));
    }

    /**
     * Tests the {@link Client#setName(String)} and {@link Client#getName()} methods.
     * Sets a client's name and verifies if it is retrieved correctly.
     */
    @ParameterizedTest
    @CsvSource({
            "John",
            "Jane"
    })
    void testGetSetName(String name) {
        Client client = new Client();
        client.setName(name);
        Assertions.assertEquals(name, client.getName());
    }

    /**
     * Tests the {@link Client#setSurname(String)} and {@link Client#getSurname()} methods.
     * Sets a client's surname and verifies if it is retrieved correctly.
     */
    @ParameterizedTest
    @CsvSource({
            "Doe",
            "Smith"
    })
    void testGetSetSurname(String surname) {
        Client client = new Client();
        client.setSurname(surname);
        Assertions.assertEquals(surname, client.getSurname());
    }

    /**
     * Tests the {@link Client#setAge(Integer)} and {@link Client#getAge()} methods.
     * Sets a client's age and verifies if it is retrieved correctly.
     */
    @ParameterizedTest
    @CsvSource({
            "30",
            "25"
    })
    void testGetSetAge(int age) {
        Client client = new Client();
        client.setAge(age);
        Assertions.assertEquals(age, client.getAge());
    }

    /**
     * Tests the {@link Client#setPhoneNo(Integer)} and {@link Client#getPhoneNo()} methods.
     * Sets a client's phone number and verifies if it is retrieved correctly.
     */
    @ParameterizedTest
    @CsvSource({
            "123456789",
            "987654321"
    })
    void testGetSetPhoneNo(int phoneNo) {
        Client client = new Client();
        client.setPhoneNo(phoneNo);
        Assertions.assertEquals(phoneNo, client.getPhoneNo());
    }

    /**
     * Tests the {@link Client#setId(Integer)} and {@link Client#getId()} methods.
     * Sets a client's ID and verifies if it is retrieved correctly.
     */
    @ParameterizedTest
    @CsvSource({
            "1",
            "2"
    })
    void testGetSetId(int id) {
        Client client = new Client();
        client.setId(id);
        Assertions.assertEquals(id, client.getId());
    }

    /**
     * Tests the {@link Client#setMaill(String)} and {@link Client#getMaill()} methods.
     * Sets a client's email address and verifies if it is retrieved correctly.
     */
    @ParameterizedTest
    @CsvSource({
            "john.doe@example.com",
            "jane.doe@example.com"
    })
    void testGetSetMaill(String maill) {
        Client client = new Client();
        client.setMaill(maill);
        Assertions.assertEquals(maill, client.getMaill());
    }
}
