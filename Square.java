import java.awt.Color;
import java.awt.Point;

public class Square extends Rectangle{
	public Square(Point pointUL, int width, Color color, Boolean filled) {
		super(pointUL, width, width, color, filled);
	}
}
