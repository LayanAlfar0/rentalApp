package rentalApp;
public class Contract {
    private Customer customer;
    private Building building;
    private String rentalPeriod;
    private double price;
    private String startDate;
    private String endDate;

    public Contract(Customer customer, Building building, String rentalPeriod, double price, String startDate, String endDate) {
        this.customer = customer;
        this.building = building;
        this.rentalPeriod = rentalPeriod;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void generateContract() {
        // Contract generation logic
        System.out.println("Contract generated for " + customer.getName() +
                " renting " + building.getName() +
                " for " + rentalPeriod + " at " + price + 
                " from " + startDate + " to " + endDate);
    }

    // Getters and Setters
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public String getRentalPeriod() {
        return rentalPeriod;
    }

    public void setRentalPeriod(String rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
