package answermodel;

import java.util.Scanner;

public class Metropolis {
	public static Scanner in;
	private static int MCode;
	private static String MName;
	private static long Mpop;
	private static float Area;
	private static float PopDens;
	private static float calDen() {
		float Density=0;
		Density = PopDens/Area;
		return Density;
	}
	
	private static void enter() {
		in =new Scanner(System.in);
		System.out.println("Enter Mcode : ");
		MCode = in.nextInt();
		System.out.println("Enter MName : ");
		MName = in.next();
		System.out.println("Enter Mpop : ");
		Mpop = in.nextLong();
		System.out.println("Enter area : ");
		Area = in.nextFloat();
		System.out.println("Enter PopDens : ");
		PopDens = in.nextFloat();
	}
	private static void viewAll(float des) {
		System.out.println("High populated area : "+des);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float des=0;
		enter();
		des = calDen();
		if(des>1200) {
			viewAll(des);
		}else {
			System.out.println("Here are value of Destiny less than 1200 is " + des);
		}
		
	}

}
