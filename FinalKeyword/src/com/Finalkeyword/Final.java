package com.Finalkeyword;



class Parent{
	private final int sal;
	 public Parent(){
		this.sal = 564
				
				
				
				
				
				;
		System.out.println("Parent class constructor");
	}
	 public Parent(int sal) {
		
		this.sal=sal;
		 System.out.println("Salary="+sal);
	 }
	 void display() {
		 System.out.println("Parent display");
	 }
}
class Child extends Parent{
	public Child(){
		System.out.println("Child class constructor");
	}
	public Child(int sal) {
		super(sal);//call super class constructor , it should be the first line
		System.out.println("other statements");
		}
	 void display() {
		System.out.println("child display");
		super.display();
	}
	
}
public class Final {

	public static void main(String[] args) {
		//Parent ob=new Parent();
		Child ob1=new Child(); 
		Child ob2=new Child(784);
		ob2.display();
	}
}





