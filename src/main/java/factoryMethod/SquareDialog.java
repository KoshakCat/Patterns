package factoryMethod;

public class SquareDialog extends Dialog {
    @Override
    public Figure createFigure() {
        return new SquareFigure();
    }
}
