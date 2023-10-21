/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polsl.lab1.Models;

/**
 *
 * @author Pawel Pluta
 */
public class Room {
    
    Integer no;
    Integer lvl;
    String[] standard = {"Apartment","Luxury","Family","Economy"};
    Integer Capacity;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getLvl() {
        return lvl;
    }

    public void setLvl(Integer lvl) {
        this.lvl = lvl;
    }

    public Integer getCapacity() {
        return Capacity;
    }

    public void setCapacity(Integer Capacity) {
        this.Capacity = Capacity;
    }
    
    
    
    
}
