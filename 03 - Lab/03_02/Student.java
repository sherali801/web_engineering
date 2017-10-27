public class Student implements StudentData {

	private String name;
	private String rollNumber;
	private double CGPA;

	public void setName(String name) { this.name = name; }

	public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }

	public void setCGPA(double CGPA) { this.CGPA = CGPA; }

	public String getName() { return this.name; }

	public String getRollNumber() {	return this.rollNumber;	}

	public double getCGPA() { return this.CGPA; }

	public void showData() {
		System.out.println("Name: " + this.getName() + "\nRoll Number: " + this.getRollNumber() + "\nCGPA: " + this.getCGPA() + "\n");
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Sher Ali");
		student.setRollNumber("BCSF15M012");
		student.setCGPA(2.92);
		student.showData();
	}

}
