package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	 private int eid;
	 private String ename;
	 private int esalary;
	 
	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	 
	
 }
public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
			Employee employee = new Employee(01, "Gopika", 15000);
			
			//Serialization
			FileOutputStream fout = new FileOutputStream("D://ObjectFile.text");
			ObjectOutputStream objout = new ObjectOutputStream (fout); // converts fout to store it in txt file
			objout.writeObject(employee);
			objout.close();
			fout.close();
			System.out.println("Object saved");
			
			//De-Serialization
			FileInputStream fin = new FileInputStream("D://ObjectFile.text");
			ObjectInputStream objin = new ObjectInputStream(fin);
			Employee emp = (Employee) objin.readObject();
			objin.close();
			fin.close();
			System.out.println(emp);

	}

}
