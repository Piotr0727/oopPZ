import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Point p1 = new Point(30,50);
//        Point p2 = new Point(30,70);
//        Segment Line = new Segment(new Point(p1),new Point(p2));
//        p1.setY(200);
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(10,10));
        points.add(new Point(10,70));
        points.add(new Point(100,200));
        Polygon poly = new Polygon(points,new Style("#ffff00","#ff00ff",5));
        try{
            FileWriter fw = new FileWriter("ksztalty.svg");
            fw.write(poly.toSvg());
            fw.close();
        }
        catch(IOException e){
            System.out.println("Not workin");
        }
        int ch;
        FileReader fr = null;
        try{
            fr = new FileReader("ksztalty.svg");
        }
        catch (FileNotFoundException fe){
            System.out.println("File not found");
        }
        try{
            while ((ch=fr.read())!=-1)
                System.out.print((char)ch);
            fr.close();
        }
        catch(IOException e){
            System.out.println("ERRRRRRRORRRRRRRRRR0RRRORRRR");
        }

    }
}