import java.util.ArrayList;

public class SvgScene {
    public double height,width;
    private ArrayList<Shape> shapes;
    public SvgScene(double height, double width) {
        this.height = height;
        this.width = width;
        shapes = new ArrayList<>();
    }
    public SvgScene(){
        shapes = new ArrayList<>();
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public String toSvg(){
        String beggining = "<svg height=\"" + height +
                "\" width=\"" + width +
                "\" xmlns=\"http://www.w3.org/2000/svg\">\n";
                String middle = "";
                for(Shape s : shapes){
                    middle += "\t" + s.toSvg() + "\n";
                }
                String ending = "</svg>";
                return beggining + middle + ending;
    }
}
