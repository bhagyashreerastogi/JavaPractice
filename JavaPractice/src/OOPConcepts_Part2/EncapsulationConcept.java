package OOPConcepts_Part2;

public class EncapsulationConcept {

	// Encapsulation is a process of wrapping code and data together into a single unit.
	// Encapsulation is also called as Data hiding, It helps the programmer to hide the business logic and
	//the user to give access only to the desired code.
	// Encapsulation is part of OOP.
	
	// Advantages of encapsulation:
	//1. It provides flexibility to change code internally without relieving any details from outside.
	//2. It provides maintainability and re-usability of the code.
	//3. These private variables can be made read only if we don't define setter methods.
	//External users can never be knowing what's going behind the scene, means will not know about the internal implementation.
	//To provide high level security in java, Encapsulation is used.

	//How to implement encapsulation in Java:

	//1. We have to create private data variable: so that these variables cannot be accessed directly from outside the class.
	private int ssn;
	private int empAge;
	private String empName;
	
	public static void main(String[] args) {
		EncapsulationConcept emp=new EncapsulationConcept();
		emp.setEmpName("Tom");
		emp.setEmpAge(25);
		emp.setSsn(123456);

		System.out.println("Employee Name is : "+emp.getEmpName());
		System.out.println("Employee Age is : "+emp.getEmpAge());
		System.out.println("Employee ssn is : "+emp.getSsn());
	}

	//2. We have to create public getter and setter methods: to set and get the values of the fields 
	//getter and setter methods will be always public so that it can be accessed outside the class.

	public int getSsn() 
	{ 
		return ssn; 
	}

	public void setSsn(int ssn) 
	{ 
		this.ssn = ssn; 
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
