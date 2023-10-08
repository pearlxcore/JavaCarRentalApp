import java.text.MessageFormat;
import java.util.UUID;

public class Car {
    private final UUID id;
    private String brand;
    private String model;
    private int year;
    private String color;

    public Car(String brand, String model, int year, String color) {
        this.color = color;
        this.id = UUID.randomUUID();
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
         return MessageFormat.format("Id : {0}\nBrand : {1}\nModel : {2}\nYear make : {3}",
                id,
                brand,
                model,
                year);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
