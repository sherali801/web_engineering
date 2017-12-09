
public class Result {
	
	private double totalMarks;
	private double marksObtained;
	
	public Result(double totalMarks, double marksObtained) {
		
		this.setTotalMarks(totalMarks);
		this.setMarksObtained(marksObtained);
		
	}
	
	public void setTotalMarks(double totalMarks) { this.totalMarks = totalMarks; }
	
	public void setMarksObtained(double marksObtained) { this.marksObtained = marksObtained; }
	
	public double getTotalMarks() { return this.totalMarks; }
	
	public double getMarksObtanied() { return this.marksObtained; }

}
