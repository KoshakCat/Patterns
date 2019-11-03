package chainResponsibility;

public class InternalBankPaymentHandler extends Handler {
    public InternalBankPaymentHandler(int idPayment) {
        super(idPayment);
    }

    @Override
    public void printedMessage() {
        System.out.println("Your " + PaymentType.INTERNAL_BANK + " payment request has been done");
    }
}
