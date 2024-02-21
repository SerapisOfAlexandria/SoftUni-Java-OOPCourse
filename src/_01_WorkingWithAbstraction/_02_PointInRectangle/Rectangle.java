package _01_WorkingWithAbstraction._02_PointInRectangle;

public class Rectangle {
    private int[] bottomLeftCoordinates = new int[2];
    private int[] topRightCoordinates = new int[2];

    public Rectangle(String[] coordinates) {
        bottomLeftCoordinates[0] = Integer.parseInt(coordinates[0]);
        bottomLeftCoordinates[1] = Integer.parseInt(coordinates[1]);
        topRightCoordinates[0] = Integer.parseInt(coordinates[2]);
        topRightCoordinates[1] = Integer.parseInt(coordinates[3]);
    }

    public boolean contains(Point point) {
        boolean isInLowerBounds = point.getX() >= bottomLeftCoordinates[0] && point.getX() <= topRightCoordinates[0];
        boolean isInUpperBounds = point.getY() >= bottomLeftCoordinates[1] && point.getY() <= topRightCoordinates[1];
        if (isInLowerBounds && isInUpperBounds) {
            return true;
        }
        return false;
    }
}
