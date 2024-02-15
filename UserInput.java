import java.util.*;

class UserInput {
	Scanner sc = new Scanner(System.in);
	String name,dob;
	int prn;
	Object[] array = new Object[3]; //not the same object as we study in java here it can save any data type

	public Object[] inputStudent(){
		System.out.println("Enter name of Student:");
		name = sc.next();

		System.out.println("Enter PRN of Student:");
		prn = sc.nextInt();

		System.out.println("Enter DOB of Student:");
		dob = sc.next();

		array[0] = name;
		array[1] = prn;
		array[2] = dob;

		return array;
	}
}