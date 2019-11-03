package chainResponsibility;

public class GovernmentalPaymentHandler extends Handler {
    public GovernmentalPaymentHandler(int idPayment) {
        super(idPayment);
    }

    @Override
    public void printedMessage() {
        System.out.println("Your " + PaymentType.GOVERNMENTAL + " payment request has been done");
    }
}
