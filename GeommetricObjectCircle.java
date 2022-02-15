public class GeommetricObjectCircle extends GeometricObject {
	private double radius;
	static final double PI = 3.14159265359;

	public GeommetricObjectCircle() {
		this.radius = radius;
	}

	public GeommetricObjectCircle(double radius) {
		this.radius = radius;
	}
	
	public GeommetricObjectCircle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return PI * this.radius * this.radius; 
	}
	
	public double getPerimeter() {
		return 2 * PI * this.radius;
	}
	
	public double getDiameter() {
		return 2 * this.radius;
	}
	
	public void printCircle() {
		System.out.println("A cirlce created on " + getDateCreated());
		System.out.println("color : " + getColor() + " and filled: " + isFilled());
		System.out.println("The color is  " + getColor());
		System.out.println("The radius is  " + getRadius());
		System.out.println("The area is  " + getArea());
		System.out.println("The diameter is  " + getDiameter());
	}
}
