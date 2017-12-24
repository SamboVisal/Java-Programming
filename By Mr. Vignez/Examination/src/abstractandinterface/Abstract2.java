package abstractandinterface;

public abstract class Abstract2 {
		private String name;
		private int age;
		Abstract2(String name, int age){
			this.name = name;
			this.age = age;
			System.out.println("constructor 2");
			System.out.println("inside 2"+" " + name);
		}
	
		public int getAge(){
			return age;
		}

		public void Output(){
			System.out.println("Inside 2");
			System.out.println(name );
			System.out.println("age");
		}
		
}
