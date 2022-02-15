public class TestCircleRectangle {

	public static void main(String[] args) {
		GeommetricObjectCircle geommetricObjectCircle = new GeommetricObjectCircle(1);
		GeometricObjectRectangle geometricObjectRectangle = new GeometricObjectRectangle(2, 4);
		
		System.out.println("A circle " + geommetricObjectCircle.toString());;
		System.out.println("The color is  " + geommetricObjectCircle.getColor());
		System.out.println("The radius is  " + geommetricObjectCircle.getRadius());
		System.out.println("The area is  " + geommetricObjectCircle.getArea());
		System.out.println("The diameter is  " + geommetricObjectCircle.getDiameter());
		
		System.out.println("A rectangle " + geometricObjectRectangle.toString());
		System.out.println("The area is  " + geometricObjectRectangle.getArea());
		System.out.println("The diameter is  " + geometricObjectRectangle.getPerimeter());
	}

}
