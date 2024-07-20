package rentalApp;

public class Building {
    private String address;
    private String name;
    private String size;
    private double rentalPrice;
    private String ownerName;

    public Building(String address, String name, String size, double rentalPrice, String ownerName) {
        this.address = address;
        this.name = name;
        this.size = size;
        this.rentalPrice = rentalPrice;
        this.ownerName = ownerName;
    }

    // Getters and Setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
