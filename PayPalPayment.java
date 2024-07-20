package rentalApp;
public class PayPalPayment extends PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paid via PayPal");
    }
}

