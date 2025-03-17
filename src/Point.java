public class Point {
    private double x,y;
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point translate(double x, double y){
        this.x += x;
        this.y += y;
        return this;
    }
    public Point translated(double x, double y){
        Point p1 = new Point(0,0);
        p1.x = this.x+x;
        p1.y = this.y+y;
        return p1;
    }
    public Point(Point to_copy){
        this.x = to_copy.getX();
        this.y = to_copy.getY();
    }
}