package rentalApp;
public class Apartment extends Building {
    private int floorNumber;
    private boolean hasBalcony;

    public Apartment(String address, String name, String size, double rentalPrice, String ownerName, int floorNumber, boolean hasBalcony) {
        super(address, name, size, rentalPrice, ownerName);
        this.floorNumber = floorNumber;
        this.hasBalcony = hasBalcony;
    }

    // Getters and Setters
    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }
}