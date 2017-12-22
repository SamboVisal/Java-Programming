
public class Arimatic {

	int add(int a, int b){
		int c;
		c = a+b;
		return c;
	}
	int sub(int a, int b){
		return a - b;
	}
	int div(float a, float b){
		return (int) (a/b);
	}
	//converting value of one data type into another is called type conversion
	//implicit type conversion : the conversion of smaller type value into the higher type is called implicit type
	//the conversion is taken care by complier
	//explicit type conversion: the conversion of bigger type into lower type is call explicit type
	//in this conversion the accuracy of data will be lost, the conversion is taken by programmer
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arimatic ob = new Arimatic();
		int re=ob.add(20, 10);
		System.out.println("The addition is "+re);
		re = ob.sub(90, 20);
		System.out.println("The substration is "+re);
		//implicit
		re = ob.div(20,2);
		System.out.println("The division is " + re);
	}

}
