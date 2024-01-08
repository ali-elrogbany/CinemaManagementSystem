####Cinema Management System
This repository contains a Cinema Management System implemented in Java. The system is designed to manage customers, employees, genres, movies, snacks, rooms, seats, screens, and speaker information for a cinema.

###Classes
##1. Customer Class
The Customer class represents cinema customers and includes methods for login, registration, and purchasing tickets and snacks.

#Methods:
Login(): Authenticates a customer based on provided credentials.
Register(): Registers a new customer.
BuyTicket(Ticket ticket): Allows the customer to buy a movie ticket.
BuySnack(IBuySnack snack): Allows the customer to buy a snack.

##2. Employee Class
The Employee class represents cinema employees and includes methods for login, registration, and managing genres, movies, and rooms.

Methods:
Login(): Authenticates an employee based on provided credentials.
Register(): Registers a new employee.
AddGenre(Genre genre): Adds a new genre to the system.
AddMovie(Movie movie): Adds a new movie to the system.
AddRoom(Room room): Adds a new room to the system.

##3. Genre Class
The Genre class represents movie genres and includes methods for adding and retrieving genres.

Methods:
AddGenre(): Adds a new genre to the system.
readGenresFromFile(): Reads genres from a file.
writeGenreToFile(): Writes genres to a file.
GetGenreCombobox(): Retrieves a combo box model for genres.

##4. IBuySnack Interface
The IBuySnack interface defines a common method Buy() for snack classes.

##5. Movie Class
The Movie class represents movies and includes methods for adding and retrieving movies.

Methods:
AddMovie(): Adds a new movie to the system.
readMoviesFromFile(): Reads movies from a file.
writeMovieToFile(): Writes movies to a file.
GetMovieCombobox(): Retrieves a combo box model for movies.

##6. Nacho Class
The Nacho class represents nacho snacks and implements the IBuySnack interface.

Methods:
Buy(): Adds nachos to the system.

##7. Popcorn Class
The Popcorn class represents popcorn snacks and implements the IBuySnack interface.

Methods:
Buy(): Adds popcorn to the system.

##8. Room Class
The Room class represents cinema rooms and includes methods for adding and retrieving rooms.

Methods:
AddRoom(): Adds a new room to the system.
readRoomsFromFile(): Reads rooms from a file.
writeRoomToFile(): Writes rooms to a file.
GetRoomsByMovie(): Retrieves rooms by a specific movie.
GetRoomsCombobox(): Retrieves a combo box model for rooms.

##9. Screen Class
The Screen class represents cinema screens.

##10. Seat Class
The Seat class represents cinema seats.

Methods:
GetSeatsCombobox(): Retrieves a combo box model for seats.

##11. Slushy Class
The Slushy class represents slushy snacks and implements the IBuySnack interface.

Methods:
Buy(): Adds slushies to the system.

##12. Snack Class
The Snack class is an abstract class that provides a foundation for snack classes.

##13. SoftDrink Class
The SoftDrink class represents soft drinks, extending the Snack class, and implements the IBuySnack interface.

Methods:
Buy(): Adds soft drinks to the system.
readSoftDrinksFromFile(): Reads soft drinks from a file.
writeSoftDrinkToFile(): Writes soft drinks to a file.

##14. Speaker Class
The Speaker class represents speakers.

##15. Ticket Class
The Ticket class represents movie tickets and includes methods for booking tickets.

Methods:
IsTicketBooked(ArrayList<Ticket> ticketsList): Checks if a ticket is already booked.
readTicketsFromFile(): Reads tickets from a file.
writeTicketToFile(): Writes tickets to a file.
BookTicket(): Books a movie ticket.

##16. User Class
The User class represents users and includes methods for user information.

Methods:
isUsernameTaken(ArrayList<User> customersList, String username): Checks if a username is already taken.
readUsersFromFile(String path): Reads users from a file.
writeUserToFile(ArrayList<User> userList, String path): Writes users to a file.

###Usage
To use the Cinema Management System, follow these steps:

1. Clone the repository to your local machine.
2. Compile and run the Java classes in your preferred IDE.
3. Interact with the system through the implemented methods in the various classes.
4. Feel free to explore and customize the system based on your cinema management needs.

###License
This project is licensed under the MIT License.
