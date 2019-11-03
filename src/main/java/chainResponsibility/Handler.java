package chainResponsibility;

public abstract class Handler {
    private Handler nextHandler;
    private int priority;


    public Handler(int priority) {
        this.priority = priority;
    }

    public void setNextHandler (Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void notifyUser (PaymentType paymentType) {
        if (paymentType.getIdPayment() >= priority) {
            printedMessage();
        }
        if (nextHandler != null) {
            nextHandler.notifyUser(paymentType);
        }
    }

    public abstract void printedMessage();

}
