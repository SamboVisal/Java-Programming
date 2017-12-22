package Trainning;



public class Sleep {
	int myPetage;
	public  Sleep(String name){
		System.out.println("The name of your pet is " + name);
	}
	public void setAge(int age){
		myPetage = age;
	}
	public int getAge(){
		System.out.println("The Age of your pet is "+ getAge());
		return myPetage;
	}
	public void Output(){
		System.out.printf("The age of your pet is %d",myPetage);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet PetObject = new Pet("John");
		PetObject.setAge(10);
		PetObject.getAge();
		PetObject.Output();
		System.out.println("\nThe variable value is "+ PetObject.myPetage);
	}

}
