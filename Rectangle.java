import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Polygon {
	public Rectangle(Point PointUL, int width, int height, Color color, Boolean filled) {
		super(color, filled);
		location = new Point[4];
		
		location[0] = new Point(PointUL.x, PointUL.y);
		location[1] = new Point(PointUL.x + width, PointUL.y);
		location[2] = new Point(PointUL.x + width, PointUL.y - height);
		location[3] = new Point(PointUL.x, PointUL.y - height);
	}
}
