package rentalApp;
public class MasterCardPayment extends PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paid via MasterCard");
    }
}
