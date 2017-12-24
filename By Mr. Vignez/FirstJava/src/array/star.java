package array;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=5;i>=0;i--){
			for(j=i;j<5;j++){
				System.out.printf("*");
			}
			System.out.println("\n");
		}
		/*
		for(i=1;i<=5;i++){
			
			System.out.printf("\n");
		
		for(j=1;j<=i;j++)
		       { 
			      System.out.printf("%d",i);
			
			   }
		  }
		  */
		//array is a collection of same data item store in command name, the element of array
		//are store in the sequence memory.. advantages:
		/*
		 because of sequence memory location array are faster
		 address calculation may easier with array
		 disadvantages
		 array of static data structure that means array can be resize
		 array can not be a collection of the similar type
		 */
		for(i=0;i<5;i++){
			System.out.println("\n");
			for(j=1;j>=i;j++){
				System.out.printf("%d",j);
			}
		}
	}

}
