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

        List<Rental> rentalList = List.of(
                new Rental(new Date(2023, 6, 13), new Date(2023, 6, 20), new Customer("John", "john@mail.com", "01234567"), new Car("Toyota", "Camry", 2022, "Silver")),
                new Rental(new Date(2023, 6, 13), new Date(2023, 6, 20), new Customer("Mary", "mary@mail.com", "98765432"), new Car("Ford", "Mustang", 2020, "Blue")),
                new Rental(new Date(2023, 6, 13), new Date(2023, 6, 20), new Customer("Robert", "robert@mail.com", "11223344"), new Car("Volkswagen", "Jetta", 2021, "Black")),
                new Rental(new Date(2023, 6, 13), new Date(2023, 6, 20), new Customer("Emily", "emily@mail.com", "55555555"), new Car("Hyundai", "Elantra", 2019, "White")),
                new Rental(new Date(2023, 6, 13), new Date(2023, 6, 20), new Customer("David", "david@mail.com", "66666666"), new Car("Chevrolet", "Cruze", 2020, "Red")),
                new Rental(new Date(2023, 6, 13), new Date(2023, 6, 20), new Customer("Sophia", "sophia@mail.com", "77777777"), new Car("Kia", "Sorento", 2021, "Green")),
                new Rental(new Date(2023, 6, 13), new Date(2023, 6, 20), new Customer("Olivia", "olivia@mail.com", "88888888"), new Car("Mazda", "CX-5", 2022, "Blue")),
                new Rental(new Date(2023, 6, 13), new Date(2023, 6, 20), new Customer("Liam", "liam@mail.com", "99999999"), new Car("Subaru", "Outback", 2020, "Gray"))
        );

        // initialize gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println("\nRental detail:");

        for (Rental rental_ : rentalList ) {
            String rentalDetailJson = gson.toJson(rental_);
            System.out.println(rentalDetailJson);
            System.out.println();
        }
    }
}