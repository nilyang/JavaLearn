package QA.WeekThree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DistanceMap {

	Map<String, Integer> distance_map = new HashMap<String, Integer>();

	public DistanceMap() {
		// TODO Auto-generated constructor stub
	}

	public void add(String from, String dist, int distance) {
		String key = makeKey(from, dist);
		if (!distance_map.containsKey(key)) {
			distance_map.put(key, distance);
		}
	}

	public int search(String from, String dist) {
		return distance_map.get(makeKey(from, dist));
	}

	public void print() {
		System.out.println(this.distance_map);
	}

	private String makeKey(String from, String dist) {
		String key;
		int comp = from.compareTo(dist);
		if (comp > 0) {
			key = dist + ":" + from;
		} else {
			key = from + ":" + dist;
		}

		return key;
	}

	public static void main(String[] args) {
		DistanceMap dist = new DistanceMap();
		dist.add("shanghai", "hangzhou", 123);
		dist.add("wuhan", "hangzhou2", 23);
		dist.add("gaosu", "hangzhou3", 3312);
		dist.print();
	}

}
