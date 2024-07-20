package rentalApp;
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Layan", "layan@example.com", "123-456-7890");
        Apartment apartment = new Apartment("Tulkarm", "Downtown Apartment", "1200 sqft", 1000.0, "Leen", 3, true);
        customer.rentBuilding(apartment);

        Contract contract = new Contract(customer, apartment, "12 months", 1000, "2024-01-01", "2024-12-31");
        contract.generateContract();

        PaymentMethod paymentMethod = new PayPalPayment();
        customer.payRent(paymentMethod);
    }
}
