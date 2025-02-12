package com.celcom.day7;


// Anonymous 
interface Interface {
	void display();
}

public class InnerClass{
	
	class InnerClass1 {
		void method (){
			System.out.println("Non - Static Inner Class");
		}
	}
	
	static class InnerClass2 {
		void method (){
			System.out.println("Static Inner Class");
		}
	}
	
	void myMethod () {
		class InnerClass3 {
			void method() {
				System.out.println("Local Inner Class");
			}
		}
		
		InnerClass3 inner3 = new InnerClass3();
		inner3.method();
	}
	
	//Before Anonymous
	/*public void display() {
		System.out.println("Anonymous Inner Class");
	}
	*/
	public static void main(String[] args) {
		
		InnerClass obj = new InnerClass ();
		InnerClass1 inner = obj.new InnerClass1();
		
		inner.method();
		
		InnerClass.InnerClass2 inner2 = new InnerClass.InnerClass2();
		inner2.method();
		
		//obj.display();
		
		//After Anonymous
		Interface obj1 = new Interface () {
			public void display () {
				System.out.println("Display");
			}
		};
		obj1.display();
		
		//Lambda Expression
		Interface obj2 = () -> System.out.println("Display");
		obj2.display();
		
	}

}
