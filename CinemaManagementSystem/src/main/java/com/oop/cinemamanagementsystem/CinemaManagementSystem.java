package com.oop.cinemamanagementsystem;

import classes.User;


public class CinemaManagementSystem {

    public static void main(String[] args) {
        User u1 = new User("Ali ElRogbany", "alielrogbany", "a.elrogbany@gmail.com", "123");
        System.out.println(u1.Register());
    }
}
