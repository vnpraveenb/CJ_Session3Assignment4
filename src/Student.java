
public class Student {

	private String name;
	private int phoneNumber;
	private int rollNumber;
	private int studentClass;
	
	// Setter Methods
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPhoneNumber(int phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public void setRollNumber(int rollNumber)
	{
		this.rollNumber = rollNumber;
	}
	
	public void setStudentClass(int studentClass)
	{
		this.studentClass = studentClass;
	}
	
	//Getter Methods
	
	public String getName()
	{
		return this.name;
	}
	
	public int getPhoneNumber()
	{
		return this.phoneNumber;
	}
	
	public int getRollNumber()
	{
		return this.rollNumber;
	}
	
	public int getStudentClass()
	{
		return this.studentClass;
	}
  	
	//Result Method
	public String result(String name, int phoneNumber,int rollNumber, int studentClass, int subject1, int subject2, int subject3)
	{
		this.setName(name);
		this.setPhoneNumber(phoneNumber);
		this.setRollNumber(rollNumber);
		this.setStudentClass(studentClass);
		 		
		if((subject1 < 35) || (subject2 < 35) || (subject3 < 35)){
			return  "The student named: " + getName() + "\nRollNumber: " + getRollNumber() + "\nof Class: " + getStudentClass() + " has Failed " ;
		}
		else{
			return  "The student named: " + getName() + "\nRollNumber: " + getRollNumber() + "\nof Class: " + getStudentClass() + " has Passed " ;

		}
	}
}
