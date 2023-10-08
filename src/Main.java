import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create customer
        Customer customer = new Customer("izat", "izat@mail", "0176612934");

        // create car
        Car car = new Car("Proton", "Wira", 1990, "Red");

        // create rental
        Date rentStartDate = new Date(2023, 06, 13);
        Date rentEndDate = new Date(2023, 06, 20);

        List<Rental> RentalList = List.of(
                new Rental(rentStartDate, rentEndDate, new Customer("Nadia", "nadia@mail.com", "01772882"), new Car("Honda", "City", 2021, "Red")),
                new Rental(rentStartDate, rentEndDate, new Customer("Izzat", "izzat@mail.com", "0255537"), new Car("Proton", "Saga", 2017, "Gray")),
                new Rental(rentStartDate, rentEndDate, new Customer("Fateh", "fateh@mail.com", "093338"), new Car("Nissan", "Skyline", 2012, "White")),
                new Rental(rentStartDate, rentEndDate, new Customer("Aya", "aya@mail.com", "0333937"), new Car("Mini", "Cooper S", 2019, "Dark Green"))
        );

        // initialize gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println("\nRental detail:");

        for (Rental rental_ : RentalList ) {
            String rentalDetailJson = gson.toJson(rental_);
            System.out.println(rentalDetailJson);
            System.out.println();
        }
    }
}