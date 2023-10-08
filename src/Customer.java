import java.text.MessageFormat;
import java.util.UUID;

public class Customer {
    private final UUID id;
    private String name;

    private String email;
    private String phone;

    public Customer(String name, String email, String phone){
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public UUID getId() {
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public  void  setEmail(String email){
        this.email = email;
    }

    public void setPhone(String phone){
    this.phone = phone;
    }

    @Override
    public String toString(){
        return MessageFormat.format("Id : {0}\nName : {1}\nEmail : {2}\nPhone : {3}",
                id,
                name,
                email,
                phone);
    }
}
