import java.util.Locale;

public class StrokeShapeDecorator extends ShapeDecorator {
    private String color;
    private double width;

    public StrokeShapeDecorator(Shape decoratedShape, String color, double width) {
        super(decoratedShape);
        this.color = color;
        this.width = width;
    }
    public String toSvg(){
        return decoratedShape.toSvg(String.format(Locale.US, "stroke=\"%s\" stroke-width=\"%f\"", color, width));
    }
}
