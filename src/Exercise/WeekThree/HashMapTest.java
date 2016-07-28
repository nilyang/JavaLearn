package Exercise.WeekThree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest 
{
	public static void main(String[] args)
	{
		test_hashmap();
	}

 	public static void test_hashmap()
 	{
 		Map<String, Integer> map = new HashMap<String, Integer>();
 		map.put("Hangzhou", 1030);
 		map.put("Suzou", 2300);
 		map.put("Shanghai", 3323);

 		Integer dist = map.get("Suzou");
 		System.out.println(dist);
 		
 		Iterator<?> iter=map.entrySet().iterator();
 		while(iter.hasNext()){
 			@SuppressWarnings("unchecked")
			Map.Entry<String, Integer> entry= (Map.Entry<String, Integer>) iter.next();
 			Object key = entry.getKey();
 			Object val = entry.getValue();
 			System.out.println("Key="+key + ", Value="+val);
 		}

 	}

}
