import java.awt.Color;
import java.awt.Point;

public class PolyLine extends Polygon {

	public PolyLine(Point PointUL, Point PointUR, int thickness, Color color, Boolean filled) {
		super(color, filled);
		location = new Point[4];
		location[0] = PointUL;
		location[1] = PointUR;
		location[2] = new Point(PointUR.x, PointUR.y + thickness);
		location[3] = new Point(PointUL.x, PointUL.y + thickness);
	}
}
