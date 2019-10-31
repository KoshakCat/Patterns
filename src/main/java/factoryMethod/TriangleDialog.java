package factoryMethod;

public class TriangleDialog extends Dialog {
    @Override
    public Figure createFigure() {
        return new TriangleFigure();
    }
}
