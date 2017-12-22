package builderpattern;

public class BuilderPattern {
	static Student stud;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				stud =  new Student.StudentBuilder()
				.setId(123)
				.setName("pisal")
				.setEmail("@gmail.com")
				.getInstance();
				
				System.out.println(stud);
	}

}
