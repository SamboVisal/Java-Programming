package Trainning ;

public class B {
	
		private String Myname;
		private int a = 1997;
		public void getName(String name){
			Myname = name;
		}
		public String Return(){
			return Myname;
		}
		public void Output(){
			System.out.println("Your Birth day is " + a + "\n");
			System.out.printf("Your name is %s",Return());
		}
		
		
}
