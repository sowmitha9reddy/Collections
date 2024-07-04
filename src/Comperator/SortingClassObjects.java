package Comperator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private String department;
	private int salary;
	private float height;
	private String email;
	Employee(int id,String name,String department,String email,int salary,float height){
		this.id=id;
		this.name=name;
		this.department=department;
		this.email=email;
		this.salary=salary;
		this.height=height;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setHeight(float height) {
		this.height=height;
	}
	public int getHieght(int height)
	{
		return height;
	}
	public String getEmail() {
		return email;
	}
	public String toString() {
		
		return id +" "+name+" "+department+" "+email+" "+salary +" "+height;
	}
	
	
	
	public int compareTo(Employee e2) {
		
			Employee e1=this;
			//based on id
			/*Integer id1=e1.id;
			Integer id2=e2.id;
			int n=id1.compareTo(id2);
			return n; */
			
			
			/*if(id1>id2) {
			return 1;
		}
		else if(id1<id2) {
			return -1;
		}
		else {
			return 0;
		}
		return 0;
	} */
			//based on string
			if(!(e1.name.equals(e2.name))) {
			return e1.name.compareTo(e2.name);
			}
			return e1.email.compareTo(e2.email);
			
			
			
			//based on salary
			/*  Integer salary1=e1.salary;
			Integer salary2=e2.salary;
		    return salary1.compareTo(salary2); */
			
			//based on hieght 
			/*Float height1=e1.height;
			Float height2=e2.height;
			return height1.compareTo(height2); */
		     
	}
	
}

public class SortingClassObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no.of Employees:");  
		int n=scan.nextInt();
	
		ArrayList<Employee> al=new ArrayList<Employee>();
		TreeSet<Employee> ts=new TreeSet<Employee>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the details(id,name,department,email,salary,height) of employee" +i +":");
			String s=scan.next();
			String[] ar=s.split(",");
			int id=Integer.parseInt(ar[0]);
			String name=ar[1];
			String department=ar[2];
			String email=ar[3];
			int salary=Integer.parseInt(ar[4]);
			
			float height=Float.parseFloat(ar[5]);
			Employee e=new Employee(id,name,department,email,salary,height); 
			e.setId(id);
			e.setName(name);
			e.setSalary(salary);
			e.setDepartment(department);
			e.setEmail(email);
			e.setHeight(height);
			al.add(e);
			ts.add(e);		}
		/*Employee e1=new Employee(2,"sow","it",50000000,7.5f);
		Employee e2=new Employee(3,"thusow","it",100500,6f);
		Employee e3=new Employee(1,"aadhyasow","it",7000000,3f); */
	
		
		System.out.println(al);

		System.out.println(ts);
		
		
		Collections.sort(al);
	
	
		System.out.println(al);

		System.out.println(ts);
		

		

	}

}
