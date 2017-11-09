import java.util.Scanner;

public class StudentResultProcessing {
	
	
	
	public static void main(String[] args) {
 
		System.out.println("Taking input of the details of the student along with his/her marks in three subjects" );
		
		Student student = new Student();
		
		System.out.println("Please input the name :");
		Scanner scan1 = new Scanner(System.in);
		String name = scan1.nextLine();
		
		System.out.println("Please input the phone number :");
		Scanner scan2 = new Scanner(System.in);
		int phoneNumber = scan2.nextInt();
		
		System.out.println("Please input the roll number :");
		Scanner scan3 = new Scanner(System.in);
		int rollNumber = scan3.nextInt();
		
		System.out.println("Please input the class :");
		Scanner scan4 = new Scanner(System.in);
		int studentClass = scan2.nextInt();
		
		System.out.println("Please input the marks in subject 1 :");
		Scanner scan5 = new Scanner(System.in);
		int subject1 = scan5.nextInt();
		
		System.out.println("Please input the marks in subject 2 :");
		Scanner scan6 = new Scanner(System.in);
		int subject2 = scan6.nextInt();
		
		
		System.out.println("Please input the marks in subject 3 :");
		Scanner scan7 = new Scanner(System.in);
		int subject3 = scan7.nextInt();
		
	
		System.out.println("\nPrinting the result of the student");
		System.out.println( student.result(name, phoneNumber, rollNumber, studentClass, subject1, subject2, subject3));
		
		
		
		
	}

}
