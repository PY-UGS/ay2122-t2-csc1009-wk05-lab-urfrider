public class Square extends Shape {

	public Square(double dim1, double dim2) {
		super(dim1, dim2);
	}

	@Override
	public double area() {
		return this.dim1 * this.dim2;
	}	
	
}
