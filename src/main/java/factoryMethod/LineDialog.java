package factoryMethod;

public class LineDialog extends Dialog {
    @Override
    public Figure createFigure() {
        return new LineFigure();
    }
}
