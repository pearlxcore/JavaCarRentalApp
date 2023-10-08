import java.text.MessageFormat;
import java.util.Date;
import java.util.UUID;

public class Rental {
    private final UUID id;
    private Date rentalStartDate;
    private Date rentalEndDate;
    private Customer customer;
    private Car car;

    public Rental(Date rentalStartDate, Date rentalEndDate, Customer customer, Car car) {
        this.id = UUID.randomUUID();
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
        this.customer = customer;
        this.car = car;
    }

    public Date getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(Date rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public Date getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(Date rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString(){
        return MessageFormat.format(
                 "Rental id : {0}\n" +
                        "Rental Start : {1}\n" +
                        "Rental End : {2}\n" +
                        "Customer detail:\n" +
                            "Id : {3}\n" +
                            "Name : {4}\n" +
                            "Email : {5}\n" +
                            "Phone : {6}\n" +
                         "Car detail:\n" +
                            "Id : {7}\n" +
                            "Brand : {8}\n" +
                            "Model : {9}\n" +
                            "Year : {10}\n" +
                            "Color : {11}",
                    this.id,
                this.rentalStartDate,
                this.rentalEndDate,
                this.customer.getId(),
                this.customer.getName(),
                this.customer.getEmail(),
                this.customer.getPhone(),
                this.car.getId(),
                this.car.getBrand(),
                this.car.getModel(),
                this.car.getYear(),
                this.car.getColor());
    }
}
