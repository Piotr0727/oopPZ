import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(10,10));
        points.add(new Point(10,70));
        points.add(new Point(100,200));
        SvgScene picture = new SvgScene(1000,1000);
//        Shape poly = new SolidFilledPolygon(points,"#FF0000");
////        Shape ellipse = new Circle(new Style("#FF8888","#000000",3),new Point(200,100),30);
//        picture.getShapes().add(poly);
////        picture.getShapes().add(ellipse);
        Shape simplePolygon = new Polygon(points);
        Shape simpleEllipsis = new Ellipse(new Point(50,50),10,50);
        Shape coloredPolygon = new SolidFilledShapeDecorator(simplePolygon,"#0000FF");
        picture.getShapes().add(simpleEllipsis);
        picture.getShapes().add(coloredPolygon);
        try{
            FileWriter fw = new FileWriter("ksztalty.svg");
            fw.write(picture.toSvg());
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