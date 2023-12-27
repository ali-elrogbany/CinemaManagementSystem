/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.List;

/**
 *
 * @author alielrogbany
 */
public class Room {
    private int id;
    private Screen screen;
    private Movie movie;
    private List<Seat> seats;

    public Room(int id, Screen screen, Movie movie, List<Seat> seats) {
        this.id = id;
        this.screen = screen;
        this.movie = movie;
        this.seats = seats;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
