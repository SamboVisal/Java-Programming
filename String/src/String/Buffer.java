package String;

public class Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer tr = new StringBuffer("This is");
		tr.append(" The Best Music");
		System.out.println(tr);
		StringBuffer rev = new StringBuffer("Pisal Love");
		rev.reverse();
		System.out.println(rev);
		rev.delete(0,1);
		/*
		start -- The beginning index, inclusive.
		 end -- The ending index, exclusive.
		*/
		System.out.println(rev);
		StringBuffer ins = new StringBuffer("I Love ");
		ins.insert(7,"You");
		System.out.println(ins);
		ins.replace(7, 10, "Lyju");
		System.out.println(ins);
	}

}
