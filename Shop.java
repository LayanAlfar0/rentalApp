package rentalApp;
public class Shop extends Building {
    private String businessType;
    private boolean hasStorageRoom;

    public Shop(String address, String name, String size, double rentalPrice, String ownerName, String businessType, boolean hasStorageRoom) {
        super(address, name, size, rentalPrice, ownerName);
        this.businessType = businessType;
        this.hasStorageRoom = hasStorageRoom;
    }

    // Getters and Setters
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public boolean isHasStorageRoom() {
        return hasStorageRoom;
    }

    public void setHasStorageRoom(boolean hasStorageRoom) {
        this.hasStorageRoom = hasStorageRoom;
    }
}