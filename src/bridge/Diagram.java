package bridge;

import bridge.color.Color;
import bridge.shape.Shape;

public class Diagram {
	private Color color;
	private Shape shape;
	
	public Diagram(Color color,Shape shape) {
		this.color = color;
		this.shape = shape;
	}
	
	public void show() {
		System.out.println(color.getColor()+"µÄ"+shape.getName());
	}
}
