import java.lang.Math;

public class Segment {
    private Point p1 = new Point(0,0);
    private Point p2 = new Point(0,0);

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }
    public Segment(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Segment(double x_p1, double y_p1,double x_p2, double y_p2){
        this.p1 = new Point(x_p1,y_p1);
        this.p2 = new Point(x_p2,y_p2);
    }

    @Override
    public String toString() {
        return "Segment{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    //    public double length(){
//        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
//    }
}