package answermodel;

import java.util.HashMap;
import java.util.Map;

public class MapHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Visal");
		map.put(2,"Minoz");
		System.out.println(map);
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}
	}

}
