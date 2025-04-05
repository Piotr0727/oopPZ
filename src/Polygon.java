import java.util.ArrayList;
import java.util.Locale;

public class Polygon implements Shape {
    private ArrayList<Point> points;

    public Polygon(ArrayList<Point> points) {
        super();
        this.points = points;
    }
    public Polygon(ArrayList<Point> points, Style gangnam) {
//        super(gangnam);
        this.points = points;
    }
    public static Polygon createSquare(Segment s, Style style){
        ArrayList<Point> points = new ArrayList<>();
        points.add(s.getP1());
        points.add(s.getP2());
        // Segment perpendicularSegment = s.findPerpe();
        //points.add(perpendicularSegment.getP1);
        //points.add(perpendicularSegment.getP2);
        return new Polygon(points,style);
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + points +
                '}';
    }
//    public String toSvg(){
//        String beginning = "<polygon points=\"";
//
//
//        String midlle = "";
//        for (Point p : points){
//            midlle += p.getX() + "," +p.getY() + " ";
//        }
//        String ending ="\" " +
    //                gangnam.toSvg() +
//                "\" />\n";
//        return beginning + midlle + ending;
//    }
//
    public String toSvg(String param){
        String pointsString = "";
        for(Point point : points) {
            pointsString += point.getX() + "," + point.getY() + " ";
        }
        return String.format(Locale.ENGLISH, "<polygon points=\"%s\"  %s/>", pointsString,param);
    }

    @Override
    public String toSvg() {
        return toSvg("");
    }
}