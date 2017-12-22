package WhileLoop;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x [] = {10,20,30,40,50};
		for(int i : x){
			if(i == 30){
				continue;
			}
			System.out.print(i);
		}
	}

}
