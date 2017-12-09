
public class Box {
	
	protected double width;
	protected double height;
	protected double depth;
	
	public Box(double width, double height, double depth) {
		
		this.setWidth(width);
		this.setHeight(height);
		this.setDepth(depth);
		
	}
	
	public Box(Box box) {
		
		this.setWidth(box.getWidth());
		this.setHeight(box.getHeight());
		this.setDepth(box.getDepth());
		
	}
	
	public void setWidth(double width) { this.width = width; }
	
	public void setHeight(double height) { this.height = height; }
	
	public void setDepth(double depth) { this.depth = depth; }
	
	public double getWidth() { return this.width; }
	
	public double getHeight() { return this.height; }
	
	public double getDepth() { return this.depth; }
	
}
