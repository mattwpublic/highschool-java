package Ch8pkg;

public class RegularPolygon {
	private int numberOfSides = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	public RegularPolygon(int n, double s, double x, double y) {
		numberOfSides = n;
		side = s;
		x = this.x;
		y = this.y;
		getPerimeter();
		getArea();
	}
	
	public RegularPolygon(int n, double s) {
		numberOfSides = n;
		side = s;
		getPerimeter();
		getArea();

	}
	
	public RegularPolygon() {
		getPerimeter();
		getArea();
	}
	
	public double getPerimeter() {
		
		double perimeter = side * numberOfSides;
		return perimeter;
	}
	public double getArea() {
		double area = (numberOfSides * Math.pow(side, 2))/(4 * Math.tan(Math.PI/numberOfSides));
		return area;
	}
	

}
