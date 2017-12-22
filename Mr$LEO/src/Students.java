import java.util.Scanner;
public class Students {
	static Scanner button;
	public static void main(String[] args) {
	
	String name[] = new String[10];
	int mark[][] = new int[10][10];
	int total[] = new int[10];
	int i,n,j;
	float avg[] = new float[10];
	button = new Scanner(System.in);
	System.out.println("Input amounts of students ");
	n = button.nextInt();
	System.out.println("Input name for " + n + " Students");
	for(i=0;i<n;i++){
		
		name[i] = button.next();
	}

	for(i=0;i<n;i++){
		System.out.printf("Input mark for %d student \n", i+1);
		for(j=0; j<3; j++){
			mark[i][j] = button.nextInt();
		}
		
	}
	for(i=0;i<n;i++){
		for(j=0; j<3; j++){
			
			total[i]+=mark[i][j];
		}
		
	}
	System.out.println("\nScore for each students with name ");
	for(i=0;i<n;i++){
		System.out.println("Student name " + name[i] + " Got Scored " + total[i]);
	}
	
	for(i=0;i<n;i++){
		avg[i] = total[i]/3;
	}
	System.out.println("\nThe average for each students ");
	for(i=0;i<n;i++){
		System.out.println("Student name " + name[i] + " Got average " + avg[i] + "%");
	}
	System.out.println("\nGrade for each student ");
	for(i=0;i<n;i++){
		if(avg[i]>=100){
			System.out.println("Student name " + name[i] + " got grade \"S\" ");
		}
		else if(avg[i]<100&&avg[i]>=80){
			System.out.println("Student name " + name[i] + " got grade \"A\" ");
		}
		else if(avg[i]<80&&avg[i]>=60){
			System.out.println("Student name " + name[i] + " got grade \"B\" ");
		}
		else if(avg[i]<60&&avg[i]>=40){
			System.out.println("Student name " + name[i] + " got grade \"C\" ");
		}
		else{
			System.out.println("Student name " + name[i] + " got grade \"Fail and Resign\" ");
		}
	}
	
	
	}

}
