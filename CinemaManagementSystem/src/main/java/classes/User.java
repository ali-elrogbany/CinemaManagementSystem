package classes;

import java.io.*;

import java.awt.List;
import java.util.ArrayList;

public class User implements Serializable {
    private static final long serialVersionUID = 3319965743419553961L;

    private static int lastAssignedId = 0;
    
    private String name;
    private String username;
    private String email;
    private String password;
    private int age;
    private int phoneNumber;

    public User(String name, String username, String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(String name, String username, String email, String password, int age, int phoneNumber) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public User Login(){
        ArrayList<User> usersList = readUsersFromFile();
        for (User user : usersList)
        {
            if (user.username.equals(this.username))
            {
                if (user.password.equals(this.password))
                {
                    return user;
                }
                System.out.println("Incorrect Credentials!");
                return null;
            }
        }
        return null;
    }
    
    public boolean Register(){
        ArrayList<User> usersList = readUsersFromFile();
        if (!User.isUsernameTaken(usersList, this.username)){
            usersList.add(this);
            User.writeUsersToFile(usersList);
            return true;
        }
        else{
            System.out.println("User already exists!");
            return false;
        }
    }
    
    public static ArrayList<User> readUsersFromFile() {
        ArrayList<User> userList = new ArrayList<User>();

        File file = new File("users.dat");

        if (file.length() == 0) {
            // File is empty, return an empty list
            return userList;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            userList = (ArrayList<User>) ois.readObject();
        } catch (FileNotFoundException e) {
            // Ignore if the file doesn't exist yet
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userList;
    }

    private static int generateUniqueId() {
        ArrayList<User> users = readUsersFromFile();
        lastAssignedId=users.size();
        return ++lastAssignedId;
    }

    private static boolean writeUsersToFile(ArrayList<User> userList) {
        try {
            File file = new File("users.dat");

            if (!file.exists()) {
                System.out.println("File not found. Creating a new file.");
                file.createNewFile();
            }

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                oos.writeObject(userList);
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static boolean isUsernameTaken(ArrayList<User> userList, String username) {
        for (User user : userList) {
            if (user.username.equals(username)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", username=" + username + ", email=" + email + '}';
    }
}
