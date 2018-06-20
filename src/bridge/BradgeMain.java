package bridge;

import bridge.color.Color;
import bridge.color.impl.Blue;
import bridge.color.impl.Red;
import bridge.shape.Shape;
import bridge.shape.impl.Circle;
import bridge.shape.impl.Square;

public class BradgeMain {
	public static void main(String[] args) {
		Color red = new Red();
		Color blue = new Blue();
		
		Shape circle = new Circle();
		Shape square = new Square();
		
		Diagram redCircle = new Diagram(red, circle);
		redCircle.show();
		Diagram blueCircle = new Diagram(blue, circle);
		blueCircle.show();
		Diagram redSquare = new Diagram(red, square);
		redSquare.show();
		Diagram blueSquare = new Diagram(blue, square);
		blueSquare.show();
	}
}
