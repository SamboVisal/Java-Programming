package builderpattern;

public class Student {
	private String name;
	int id;
	private String email;
	Student(String name, int id, String email){
		this.name = name;
		this.id = id;
		this.email = email;
	}
	//to print the object of the class
	public String toString() {
		return id+ " : "+name+" : "+email+"\n";
	}
	static class  StudentBuilder{
		private int id;
		private String name,email;
//		public int getId() {
//			return id;
//		}
//		public void setId(int id) {
//			this.id = id;
//		}
		public StudentBuilder setId(int id) {
			this.id = id;
			return this;
		}
//		public String getName() {
//			return name;
//		}
		public StudentBuilder setName(String name) {
			this.name = name;
			return this;
		}
//		public String getEmail() {
//			return email;
//		}
		public StudentBuilder setEmail(String email) {
			this.email = email;
			return this;
		}
		public Student getInstance() {
			//store value put it in BuilderPattern
			Student stu = new Student(name,id,email);
			return stu;
		}
		
	}
}
