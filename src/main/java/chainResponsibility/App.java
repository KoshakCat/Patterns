package chainResponsibility;

public class App {
    public static void main(String[] args) {
        Handler typicalPayment = new TypicalPaymentHandler(PaymentType.TYPICAL.getIdPayment());
        Handler discountPayment = new DiscountPaymentHandler(PaymentType.DISCOUNT.getIdPayment());
        Handler governmentalPayment = new GovernmentalPaymentHandler(PaymentType.GOVERNMENTAL.getIdPayment());
        Handler internalBankPayment = new InternalBankPaymentHandler(PaymentType.INTERNAL_BANK.getIdPayment());

        typicalPayment.setNextHandler(discountPayment);
        discountPayment.setNextHandler(governmentalPayment);
        governmentalPayment.setNextHandler(internalBankPayment);

        typicalPayment.notifyUser(PaymentType.TYPICAL);
        typicalPayment.notifyUser(PaymentType.DISCOUNT);
        typicalPayment.notifyUser(PaymentType.GOVERNMENTAL);
        typicalPayment.notifyUser(PaymentType.INTERNAL_BANK);
    }
}
