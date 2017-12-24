package array;

public class same {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=1,l=0;
		for(i=1;i<=5;i++){
			for(j=0;j<5;j++){
				l=l+i;
				System.out.printf("%d ",i);
				
			}
			System.out.printf("%d",l);
			l=0;
			System.out.println("\n");
		}
	}

}
