package Comperator;

import java.util.ArrayList;
import java.util.Collections;

class Dog{
	  private String name;
	     private float price;
	     
	public Dog(String name, float price) {
			
			this.name = name;
			this.price = price;
		}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}
	
}
public class DogExampleSort {
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog("maxy",19990f);
		Dog d2=new Dog("kia",189990f);
		String s1="tap";
		String s2="academy";
		System.out.println(s1.codePointAt(0));
		int n=s1.compareTo(s2);
		System.out.println(n);
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(30);
		al.add(50);
		Collections.sort(al);
		System.out.println(al);
		ArrayList<Float> al1=new ArrayList<Float>();
		al1.add(100.8f);
		al1.add(30.56f);
		al1.add(50.00f);
		Collections.sort(al1);
		System.out.println(al1);
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("sowmitha");
		al2.add("thu");
		al2.add("aadhya");
		Collections.sort(al2);
		System.out.println(al2);
		

	}

}
