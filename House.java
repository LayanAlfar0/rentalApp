package rentalApp;
public class House extends Building {
    private int numberOfFloors;
    private boolean hasGarden;

    public House(String address, String name, String size, double rentalPrice, String ownerName, int numberOfFloors, boolean hasGarden) {
        super(address, name, size, rentalPrice, ownerName);
        this.numberOfFloors = numberOfFloors;
        this.hasGarden = hasGarden;
    }

    // Getters and Setters
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }
}