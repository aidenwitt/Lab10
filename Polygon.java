import java.awt.Color;
import java.awt.Graphics;

public abstract class Polygon extends Shape {

	public Polygon(Color color, Boolean filled) {
		super(color, filled);
	}


	public void draw(Graphics graphic) {
		int nPoints = location.length;
		int[] x = new int[nPoints];
		int[] y = new int[nPoints];
		
		for (int i = 0; i < nPoints; i++) {
			x[i] = location[i].x;
			y[i] = location[i].y;
		}
		
		graphic.setColor(this.getColor());
		if(this.isFilled()) {
			graphic.fillPolygon(x, y, nPoints);
		}
		else {
			graphic.drawPolygon(x, y, nPoints);
		}
	}

}
