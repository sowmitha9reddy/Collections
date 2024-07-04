package Comperator;

//import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Demo1 implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		Integer i1=o1.getId();
		Integer i2=o2.getId();
		
		return i1.compareTo(i2);
	}
}
class Employee1 
{
	private int id;
	private String name;
	private String department;
	private int salary;
	private float height;
	private String email;
	Employee1(int id,String name,String department,String email,int salary,float height){
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
}
public class usingCompreatorExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no.of Employees:");  
		int n=scan.nextInt();
	
		//ArrayList<Employee1> al=new ArrayList<Employee1>();
		Demo1 d1=new Demo1();
		TreeSet<Employee1> ts=new TreeSet<Employee1>(d1);
		
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
			Employee1 e=new Employee1(id,name,department,email,salary,height); 
			e.setId(id);
			e.setName(name);
			e.setSalary(salary);
			e.setDepartment(department);
			e.setEmail(email);
			e.setHeight(height);
			//al.add(e);
			ts.add(e);		
			}
		
		/*Employee e1=new Employee(2,"sow","it",50000000,7.5f);
		Employee e2=new Employee(3,"thusow","it",100500,6f);
		Employee e3=new Employee(1,"aadhyasow","it",7000000,3f); */
	
		
		//System.out.println(al);

		System.out.println(ts);
		
		
		//Collections.sort(al);
	
	
		//System.out.println(al);

		//System.out.println(ts);
		

		

	}

}
