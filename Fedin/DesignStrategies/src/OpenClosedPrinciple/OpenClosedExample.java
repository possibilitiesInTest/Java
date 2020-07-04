package OpenClosedPrinciple;

public interface Shape {
	public double calculateArea();
	// open for extension
}

class Rectangle implements Shape {
	public double length;
	public double width;
	
	public double calculateArea() {
		return length * length;
	}
}

class Circle implements Shape {
	public double radius;
	
	public double calculateArea() {
		return (22/7) * radius * radius;
	}
}

class AreaCalculator {
	public double calculateRectangleArea(Shape shape)
	{
		return shape.calculateArea();
		// implement calcArea w. method specific to that class
		// closed for modification
	}
}