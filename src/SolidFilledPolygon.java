import java.util.ArrayList;

public class SolidFilledPolygon extends Polygon{
    private String color;
    public SolidFilledPolygon(ArrayList<Point> points, String color) {
        super(points);
        this.color = color;
    }
    @Override
    public String toSvg(String param) {
        return super.toSvg("style=\"fill:" + color +
                "\"");

    }
}