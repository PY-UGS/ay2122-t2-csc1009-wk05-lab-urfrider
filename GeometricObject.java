import java.util.Date;

public class GeometricObject {
	private String color = "white";
	private boolean filled = false;
	private Date dateCreated = new Date();
	
	public GeometricObject() {
		this.color = color;
		this.filled = filled;
	}
	
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "created on " + this.dateCreated + "\ncolor: " + this.color + " and filled: " + this.filled;
	}

}
