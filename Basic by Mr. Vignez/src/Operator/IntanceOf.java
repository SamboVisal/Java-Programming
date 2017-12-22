package Operator;

public class IntanceOf {
	public class Car extends IntanceOf{ 
	public void main(String[] args) {
		// TODO Auto-generated method stub
		IntanceOf a = new Car();
		boolean result = a instanceof Car;
		System.out.println(result);
	}

}
}