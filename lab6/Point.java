public class Point {
    int xCoord;
    int yCoord;

    public Point (int x,int y) {
        xCoord = x;
        yCoord = y;

    }

    public double distanceFromAPoint(Point point){
        int xDiff = xCoord - point.xCoord;
        int yDiff = yCoord - point.yCoord;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
