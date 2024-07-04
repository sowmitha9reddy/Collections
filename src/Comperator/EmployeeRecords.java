package Comperator;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;

class Employee12 implements Comparable<Employee12>
{
	private String firstName;
	private String lastName;
	private String department;
	private String joiningDate;
	 Employee12(String firstName,String lastName,String department,String joiningDate){
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.department=department;
		 this.joiningDate=joiningDate;
		 
		
	}
	 void setFirstAnme(String firstName) {
		 this.firstName=firstName;
	 }
	void setLastName(String lastName) {
		this.lastName=lastName;
		
	}
	void setDepartment(String department) {
		this.department=department;
	}
	void setJoiningDate(String joiningDate) {
		this.joiningDate=joiningDate;
	}
	String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getDepartment() {
		return department;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	@Override
	public String toString() {
		return firstName +","+lastName+","+department+","+joiningDate;
	}
	@Override
	public int compareTo(Employee12 e2) {
		Employee12 e1=this;
		
		if(!(e1.joiningDate.equals(e2.joiningDate))) {
			
			return e1.joiningDate.compareTo(e2.joiningDate);
			
					
		}
		else if(!(e1.lastName.equals(e2.lastName))) {
			
			return e1.lastName.compareTo(e2.lastName);
		}
		else if(!(e1.firstName.equals(e2.firstName))){
			return e1.firstName.compareTo(e2.firstName);
		}
		return e1.department.compareTo(e2.department);
		
	}
	
}



public class EmployeeRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); 
		Employee12 e=null;
		ArrayList<Employee12> al=new ArrayList<Employee12>();
		TreeSet<Employee12>ts=new TreeSet<Employee12>();
		System.out.println("enter the numvber of objects");
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the details(firstName,lastName,department,joiningdate) of Employee" +i+1+":");
			String s=scan.next();
			String[] ar=s.split(",");
			e=new Employee12(ar[0],ar[1],ar[2],ar[3]);
			e.setFirstAnme(ar[0]);
			e.setLastName(ar[1]);
			e.setDepartment(ar[2]);
			e.setJoiningDate(ar[3]);
			al.add(e);	
			ts.add(e);
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	for(Object f:ts) {
		System.out.println(f);
	}
		

	}

}