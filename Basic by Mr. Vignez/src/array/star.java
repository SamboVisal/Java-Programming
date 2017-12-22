package array;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=0;
		for(i=1;i<=5;i++){
			System.out.println("\n");
			for(j=1;j<=i;j++){
				System.out.printf("%d ",j);
			}
		}
		k=1;
		for(i=1;i<=5;i++){
			System.out.println("\n");
			
			for(j=1;j<=i;j++){
				System.out.printf("%d ",k);
				k++;
			}
		}
		for(i=5;i>0;i--){
			System.out.println("\n");
			for(j=5;j>=i;j--){
				System.out.printf("%d ",j);
			}
		}
		System.out.println("\n");
		for(i=1;i<=5;i++){
			for(j=i;j<5;j++){
				System.out.print("  ");	
			 }
			for(k=i;k>0;k--){
				System.out.printf("%d ",k);
			}
			System.out.print("\n");
		  }
	}

}
