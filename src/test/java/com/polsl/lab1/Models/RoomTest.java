package com.polsl.lab1.Models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the {@link Room} class.
 */
class RoomTest {

    /**
     * Test verifying whether a room is added correctly to the list of rooms.
     *
     * @param no       Room number.
     * @param lvl      Room level.
     * @param standard Room standard.
     * @param capacity Room capacity.
     */
    @ParameterizedTest
    @CsvSource({"101, 2, Apartment, 2", "201, 1, Luxury, 4"})
    void addRoom_ValidRoom_RoomAddedToList(Integer no, Integer lvl, String standard, Integer capacity) {
        // Arrange
        Room room = new Room();
        Room roomToAdd = new Room();
        roomToAdd.setNo(no);
        roomToAdd.setLvl(lvl);
        roomToAdd.setStandard(standard);
        roomToAdd.setCapacity(capacity);

        // Act
        room.addRoom(roomToAdd);

        // Assert
        assertTrue(room.getRoomList().contains(roomToAdd));
    }

    /**
     * Test verifying whether an empty list is returned when there are no rooms.
     */
    @Test
    void getRoomList_EmptyList_ReturnsEmptyList() {
        // Arrange
        Room room = new Room();

        // Act
        List<Room> roomList = room.getRoomList();

        // Assert
        assertTrue(roomList.isEmpty());
    }

    /**
     * Test verifying whether values for room number, level, standard, and capacity are set correctly.
     *
     * @param no       Room number.
     * @param lvl      Room level.
     * @param standard Room standard.
     * @param capacity Room capacity.
     */
    @ParameterizedTest
    @CsvSource({"101, 2, Apartment, 2", "201, 1, Luxury, 4"})
    void setNoLvlStandardCapacity_ValidValues_SetsValues(Integer no, Integer lvl, String standard, Integer capacity) {
        // Arrange
        Room room = new Room();

        // Act
        room.setNo(no);
        room.setLvl(lvl);
        room.setStandard(standard);
        room.setCapacity(capacity);

        // Assert
        assertEquals(no, room.getNo());
        assertEquals(lvl, room.getLvl());
        assertEquals(Room.Standard.valueOf(standard), room.getStandard());
        assertEquals(capacity, room.getCapacity());
    }

    /**
     * Test verifying whether the setStandard method throws an exception for an invalid room standard.
     *
     * @param no       Room number.
     * @param lvl      Room level.
     * @param standard Room standard (invalid).
     * @param capacity Room capacity.
     */
    @ParameterizedTest
    @CsvSource({"101, 2, InvalidStandard, 2"})
    void setNoLvlStandardCapacity_InvalidStandard_ThrowsIllegalArgumentException(Integer no, Integer lvl, String standard, Integer capacity) {
        // Arrange
        Room room = new Room();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            room.setNo(no);
            room.setLvl(lvl);
            room.setStandard(standard);
            room.setCapacity(capacity);
        });
    }

    /**
     * Test verifying whether the setNoLvlStandardCapacity method throws an exception for invalid values.
     *
     * @param no       Room number (invalid).
     * @param lvl      Room level (invalid).
     * @param standard Room standard.
     * @param capacity Room capacity (invalid).
     */
    @ParameterizedTest
    @CsvSource({"-1, 2, Apartment, 2", "101, -1, Luxury, 4", "101, 2, Apartment, -1"})
    void setNoLvlStandardCapacity_InvalidValues_ThrowsIllegalArgumentException(Integer no, Integer lvl, String standard, Integer capacity) {
        // Arrange
        Room room = new Room();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            room.setNo(no);
            room.setLvl(lvl);
            room.setStandard(standard);
            room.setCapacity(capacity);
        });
    }
}
