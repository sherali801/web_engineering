
public class Cube extends Box {
	
	public Cube() {
		
		super(0, 0, 0);
		
	}
	
	public Cube(double parameter) {
		
		super(parameter, parameter, parameter);
		
	}
	
	public double volume() {
		
		return this.getWidth() * this.getHeight() * this.getDepth();
		
	}
	
}
