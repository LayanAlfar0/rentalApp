package rentalApp;
public class VisaPayment extends PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paid via Visa");
    }
}

