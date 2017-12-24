package serialization;

import java.io.Serializable;

public class Student implements Serializable {
	private int age;
	private String name;
	Student(int age,String name){
		this.age = age;
		this.name = name;
	}
	public String toString(){
		return age+" "+name;
	}

}
