package abstractandinterface;
interface myFace{
	public  void method1();
	public void method2();
}
interface myFace2 extends myFace{
	public void method3();
	public void method4();
}
public class Interfce1 implements myFace {
		//if implement myFace2 then need to put all methods 
		public void  method1(){
			System.out.println("Hello world");
		}
		public void method2(){
			System.out.println("Method2");
		}
		public void method3(){
			System.out.println("Method3");
		}
		public void method4(){
			System.out.println("method4");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfce1  o = new Interfce1();
		o.method1();
		o.method4();
	}

}
