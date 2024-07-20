package rentalApp;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private String phoneNumber;
    private List<Building> rentedBuildings;

    public Customer(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.rentedBuildings = new ArrayList<>();
    }

    public void rentBuilding(Building building) {
        rentedBuildings.add(building);
    }

    public void payRent(PaymentMethod paymentMethod) {
        paymentMethod.pay();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Building> getRentedBuildings() {
        return rentedBuildings;
    }

    public void setRentedBuildings(List<Building> rentedBuildings) {
        this.rentedBuildings = rentedBuildings;
    }
}
