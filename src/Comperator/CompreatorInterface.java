package Comperator;

import java.util.Scanner;
import java.util.TreeSet;



abstract class Employee11 implements Comparable<Employee11>
{
private int id;
private String  name;
private String department;
public Employee11(int id, String name, String department) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
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

}
public class CompreatorInterface {
 public static  void main(String[] args) {
	 TreeSet<Employee11> ts=new TreeSet<Employee11>();
	 Scanner scan=new Scanner(System.in);
	 System.out.println("enter the no.of objects:");
	 int n=scan.nextInt();
	 for(int i=0;i<n;i++) {
		 
	 }
	 
 }
}
