
public class Student {
	
	private String name;
	private String rollNo;
	private static String universityName;
	
	public Student() { }
	
	public Student(String name, String rollNo) {
		
		this.setName(name);
		this.setRollNo(rollNo);
		
	}
	
	public void setName(String name) { this.name = name; }
	
	public void setRollNo(String rollNo) { this.rollNo = rollNo; }
	
	public static void changeUni(String universityName) { Student.universityName = universityName; }
	
	public String getName() { return this.name; }
	
	public String getRollNo() { return this.rollNo; }
	
	public static String getUniversityName() { return Student.universityName; }
	
	public String getStudentInfo() {
		
		return "Name: " + this.getName() + "\nRoll No: " + this.getRollNo() + "\nUniversity Name: " + Student.getUniversityName();
		
	}
	
}
