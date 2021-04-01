public class TestRectangle {
    public static void main ( String[] args) {
        Point topLeft = new Point(10,10);

        Rectangle rectangle = new Rectangle(5,6,topLeft);

        System.out.println("Rectangle Area = "+ rectangle.area()+",Rectangle Perimeter = "+ rectangle.perimeter());

        Point[] points = rectangle.corners();
        for(int i = 0; i<points.length;i++){
            System.out.println("Corner " + i + " at x = "+points[i].xCoord+" at y = "+points[i].yCoord);
        }
    }
}
