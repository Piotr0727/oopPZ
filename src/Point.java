public class Point {
    public double x,y;
    public String toString(){
        return "P(x,y)=("+x+","+y+")";//s
    }
    public Point translate(double x, double y){
        this.x += x;
        this.y += y;
        return this;
    }
    public Point translated(double x, double y){
        Point p1 = new Point();
        p1.x = this.x+x;
        p1.y = this.y+y;
        return p1;
    }
}