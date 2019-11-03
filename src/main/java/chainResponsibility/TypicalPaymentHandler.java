package chainResponsibility;

public class TypicalPaymentHandler extends Handler {

    public TypicalPaymentHandler(int idPayment) {
        super(idPayment);
    }

    @Override
    public void printedMessage() {
        System.out.println("Your " + PaymentType.TYPICAL + " payment request has been done");
    }
}
