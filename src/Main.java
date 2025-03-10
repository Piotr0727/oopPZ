public class Main {
    static void max_seg(Segment[] s_arr,int size){
        double max = s_arr[0].length();
        for (int i = 0; i < size; i++) {
            if(max < s_arr[i].length())
                max = s_arr[i].length();
        }//sa
        System.out.println(max);
    }
    public static void main(String[] args) {
        Point p1 =  new Point();
        p1.x = 4;
        p1.y = 5;
        System.out.println(p1);
        p1.translate(-3,3);
        System.out.println(p1);
        Point p2 = p1.translated(-3,3);
        System.out.println(p2);
        Segment segment1 = new Segment(p1,p2);
        System.out.println(segment1.length());
        Point p3 = new Point(); Point p4 = new Point(); Point p5 = new Point(); Point p6 = new Point();
        p3.x = 5;p3.y = 3;  p4.x = 4;p4.y = 8.5;  p5.x = 6;p5.y = 10;  p6.x = 2;p6.y = 3.5;

    }
}