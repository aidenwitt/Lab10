import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

public class DrawFrame extends JFrame {
	private static DrawPanel drawPanel;
	
	public DrawFrame(String title) {
		super(title);
		drawPanel= new DrawPanel();
		drawPanel.setBackground(Color.cyan);
		
		Rectangle r1 = new Rectangle(new Point(0, 800), 800, 300, Color.GREEN, true);
		drawPanel.addShape(r1);
		Sinusoid s1 = new Sinusoid(Color.WHITE, new Point(40, 550), 1, 10, 10);
		drawPanel.addShape(s1);
		Sinusoid s2 = new Sinusoid(Color.WHITE, new Point(400, 700), 1, 10, 10);
		drawPanel.addShape(s2);
		Oval o1 = new Oval(new Point(250, 600), 100, 50, Color.yellow, true);
		drawPanel.addShape(o1);
		Oval o2 = new Oval(new Point(500, 600), 100, 50, Color.yellow, true);
		drawPanel.addShape(o2);
		Rectangle r2 = new Rectangle(new Point(300, 625), 50, 200, Color.YELLOW, true);
		drawPanel.addShape(r2);
		Rectangle r3 = new Rectangle(new Point(500, 625), 50, 200, Color.YELLOW, true);
		drawPanel.addShape(r3);
		Rectangle r4 = new Rectangle(new Point(250, 500), 350, 200, Color.YELLOW, true);
		drawPanel.addShape(r4);
		IsocelesTriangle it1 = new IsocelesTriangle(new Point(250, 300), 350, 100, Color.yellow, true);
		drawPanel.addShape(it1);
		Circle c1 = new Circle(new Point(360, 100), 150, Color.pink, true);
		drawPanel.addShape(c1);
		Rectangle r5 = new Rectangle(new Point(380, 300), 105, 100, Color.pink, true);
		drawPanel.addShape(r5);
		Diamond d1 = new Diamond(new Point(365, 120), 100, Color.yellow, true);
		drawPanel.addShape(d1);
		RightTriangle rt1 = new RightTriangle(new Point(355, 220), 30, 100, Color.yellow, true);
		drawPanel.addShape(rt1);
		RightTriangle rt2 = new RightTriangle(new Point(515, 220), -30, 100, Color.yellow, true);
		drawPanel.addShape(rt2);
		Rectangle r6 = new Rectangle(new Point(355, 150), 160, 40, Color.yellow, true);
		drawPanel.addShape(r6);
		Oval o3 = new Oval(new Point(385, 170), 20, 10, Color.white, true);
		drawPanel.addShape(o3);
		Oval o4 = new Oval(new Point(465, 170), 20, 10, Color.white, true);
		drawPanel.addShape(o4);
		Rectangle r7 = new Rectangle(new Point(390, 300), 2, 50, Color.black, true);
		drawPanel.addShape(r7);
		Rectangle r8 = new Rectangle(new Point(418, 300), 2, 25, Color.black, true);
		drawPanel.addShape(r8);
		Rectangle r9 = new Rectangle(new Point(446, 300), 2, 25, Color.black, true);
		drawPanel.addShape(r9);
		Rectangle r10 = new Rectangle(new Point(475, 300), 2, 50, Color.black, true);
		drawPanel.addShape(r10);
		Rectangle r11 = new Rectangle(new Point(404, 255), 60, 2, Color.black, true);
		drawPanel.addShape(r11);
		Circle c2 = new Circle(new Point(390, 175), 7, Color.black, true);
		drawPanel.addShape(c2);
		Circle c3 = new Circle(new Point(470, 175), 7, Color.black, true);
		drawPanel.addShape(c3);
		Oval o5 = new Oval(new Point(90, 250), 270, 100, Color.yellow, true);
		drawPanel.addShape(o5);
		Oval o6 = new Oval(new Point(500, 250), 270, 100, Color.yellow, true);
		drawPanel.addShape(o6);
		Circle c4 = new Circle(new Point(70, 240), 150, Color.pink, true);
		drawPanel.addShape(c4);
		Circle c5 = new Circle(new Point(650, 240), 150, Color.yellow, true);
		drawPanel.addShape(c5);
		
		//infinity stones
		Oval space = new Oval(new Point(700, 250), 10, 10, Color.BLUE, true);
		Oval mind = new Oval(new Point(770, 290), 10, 10, Color.yellow, true);
		Oval reality = new Oval(new Point(740, 260), 10, 10, Color.red, true);
		Oval power =  new Oval(new Point(780, 300), 10, 10, Color.magenta, true);
		Oval time = new Oval(new Point(760, 340), 10, 10, Color.green, true);
		Oval soul = new Oval(new Point(720, 360), 10, 10, Color.pink, true);
		drawPanel.addShape(space);
		drawPanel.addShape(mind);
		drawPanel.addShape(reality);
		drawPanel.addShape(power);
		drawPanel.addShape(time);
		drawPanel.addShape(soul);
		
		c5.getDiameter();
		o6.getDiameter1();
		o6.getDiameter2();
		Point test = new Point(10, 10);
		test.getLocation();
		o6.getLocation();
		Square test2 = new Square(new Point(0, 0), 10, Color.CYAN, false);
		drawPanel.addShape(test2);
		
		this.add(drawPanel);
		setSize(800, 800);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DrawFrame("Thanos");
	}
}
