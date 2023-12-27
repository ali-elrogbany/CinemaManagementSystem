/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author alielrogbany
 */
public class Seat {
    private int number;
    private String reservedBy;

    public Seat(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getReservedBy() {
        return reservedBy;
    }

    public void reserve(String reservedBy) {
        this.reservedBy = reservedBy;
    }
}
