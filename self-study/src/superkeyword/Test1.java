package superkeyword;

class superClass{
	int num = 100;
}
/*
1) To access the data members of parent class when both parent and child class have member with same name
2) To explicitly call the no-arg and parameterized constructor of parent class
3) To access the method of parent class when child class has overridden that method.
 */

public class Test1 extends superClass{
	int num = 110;
	void print() {
		System.out.println("Number is "+ super.num);
	}

	public static void main(String[] args) {
		Test1 c = new Test1();
		
		c.print();
	
	}

}
