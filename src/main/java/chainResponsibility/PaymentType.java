package chainResponsibility;

public enum PaymentType {
    TYPICAL (1), DISCOUNT(2), GOVERNMENTAL(3), INTERNAL_BANK(4);

    private int idPayment;

    PaymentType(int idPayment) {
        this.idPayment = idPayment;
    }

    public int getIdPayment() {
        return idPayment;
    }
}
