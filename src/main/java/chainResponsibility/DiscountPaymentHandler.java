package chainResponsibility;

public class DiscountPaymentHandler extends Handler {
    public DiscountPaymentHandler(int idPayment) {
        super(idPayment);
    }
    @Override
    public void printedMessage() {
        System.out.println("Your " + PaymentType.DISCOUNT + " payment request has been done");
    }
}
