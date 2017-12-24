package mapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapdemo {

	public static void main(String[] args) 
	{
		//TreeMap will sort the key of map
		Map <Integer,String>map = new HashMap<Integer,String>();
		map.put(100,"ABC");
		map.put(10,"AV");
		map.put(100, "KTV");
		map.put(200,"KTV");
		System.out.println(map);
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		Collection <String> col = map.values();
		System.out.println(col);
	}

}
