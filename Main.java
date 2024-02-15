import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UserInput userinput = new UserInput();

        Object[] detailsStudent = new Object[3];

        System.out.println("Enter number of Records:");
        int n = sc.nextInt();

        Student[] student = new Student[n]; //to create n number of instances for the n number of students

        for (int i = 0; i < n; i++){
        	detailsStudent = userinput.inputStudent();

        	student[i] = new Student();

        	student[i].setName((String)detailsStudent[0]);
        	student[i].setPrn((Integer)detailsStudent[1]);
        	student[i].setDob((String)detailsStudent[2]);
        }
        display(student);
    }

    public static void display(Student[] student){
    	int c = 1;
    	System.out.println("\t_____________RECORDS_____________");
    	for (Student X : student){
    		System.out.println("\n_____________RECORD-"+c+"_____________");
    		System.out.println("Name of Student: "+X.getName());
    		System.out.println("PRN of Student: "+X.getPrn());
    		System.out.println("D.O.B of Student: "+X.getDob());
    		c++;
    	}
    }
}