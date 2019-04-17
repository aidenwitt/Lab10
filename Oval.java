import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Oval extends Shape {
	private int diameter1;
	private int diameter2;
	
	public Oval(Point pointUL, int d1, int d2, Color color, Boolean filled) {
		super(color, filled);
		this.diameter1 = d1;
		this.diameter2 = d2;
		location = new Point[1];
		location[0] = pointUL;
	}
	
	public int getDiameter1() {
		return diameter1;
	}
	public int getDiameter2() {
		return diameter2;
	}

	@Override
	public void draw(Graphics graphic) {
		graphic.setColor(this.getColor());
		
		if(this.isFilled()) {
			graphic.fillOval(location[0].x, location[0].y, diameter1, diameter2);
		}
		graphic.drawOval(location[0].x, location[0].y, diameter1, diameter2);
	}
}
