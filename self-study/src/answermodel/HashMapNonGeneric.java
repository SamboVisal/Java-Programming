package answermodel;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapNonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new HashMap();
		
		m.put(1,"sal");
		m.put(2, "minoz");
		Set set = m.entrySet();
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry<Integer, String> m1 = (Map.Entry<Integer, String>)i.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		
	}

}
